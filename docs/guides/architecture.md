# 아키텍처 선택 가이드

> 이 문서는 **정답이 아니라 선택지와 판단 기준**이다. 어떤 구조를 고를지는 직접 정하고,
> 트랙 B에서는 `docs/adr/0000-architecture.md`에 결정을 남긴 뒤 ArchUnit 테스트로 강제한다.

평가받는 것은 "헥사고날을 썼다"가 아니라 **이 문제 크기와 제약에 왜 이 구조가 맞는지 설명할 수 있는가**다.
3시간짜리 과제에 레이어 6개를 만들면 "이 추상화가 지금 무엇을 막아 주나요?"라는 질문을 받는다.

## 1. 선택지

### A. 계층형 (Layered)

```
controller → service → repository
               ↓
             domain(entity)
```

| 장점 | 단점 |
|---|---|
| 누구나 아는 구조, 빠르다 | 로직이 service 에 몰려 "트랜잭션 스크립트 + 빈 엔티티"가 되기 쉽다 |
| Spring 기본 예제와 같다 | 도메인이 JPA·프레임워크에 묶인다 |

**신호**: CRUD 비중이 높다, 시간이 짧다, 도메인 규칙이 단순하다.

### B. 계층형 + 풍부한 도메인 모델 (Rich Domain)

A와 모양은 같지만 **규칙과 상태 전이는 도메인 객체의 메서드**에 두고, service 는 트랜잭션·조회·조립만 한다.

| 장점 | 단점 |
|---|---|
| 규칙을 순수 단위 테스트로 검증 가능 | 엔티티 = 도메인 모델이면 JPA 제약(기본 생성자, 프록시)이 도메인에 스며든다 |
| 구조 추가 비용이 거의 없다 | 도메인 경계가 커지면 엔티티가 비대해진다 |

**신호**: 상태 전이, 금액 계산처럼 **규칙이 핵심**인데 시간은 제한적이다.

### C. 헥사고날 (Ports & Adapters) / 클린 아키텍처

```
adapter.in(web) → port.in(usecase) → domain ← port.out ← adapter.out(persistence, redis, kafka)
```

| 장점 | 단점 |
|---|---|
| 도메인이 프레임워크·인프라와 완전히 분리 | 파일 수, 매핑 코드(도메인 ↔ 엔티티 ↔ DTO) 증가 |
| 락 구현(Redis ↔ DB)처럼 **인프라 교체**가 쉽다 | 작은 과제에서는 과설계로 보일 수 있다 |

**신호**: 외부 연동이 여러 개다(DB, Redis, Kafka), 인프라 구현을 바꿔 끼울 가능성이 실제로 있다.

## 2. 패키지 구조

| 방식 | 예 | 언제 |
|---|---|---|
| 레이어 기준 (package-by-layer) | `controller/`, `service/`, `repository/` | 기능이 2~3개로 적을 때 |
| 기능 기준 (package-by-feature) | `account/`, `order/` 아래에 각 레이어 | 기능이 늘어날 때, 기능 간 의존을 드러내고 싶을 때 |
| 기능 + 레이어 혼합 | `order/domain`, `order/application`, `order/web` | 기능 경계와 레이어 규칙을 **둘 다** 테스트로 강제하고 싶을 때 |

## 3. 상황별 출발점 (참고용, 강제 아님)

| 상황 | 출발점으로 흔히 쓰는 구조 | 이유 |
|---|---|---|
| 트랙 A 라이브 코딩 (50분) | 레이어 없음. 도메인 객체 + 진입점 클래스 1개 | 시간 대부분을 규칙과 테스트에 써야 한다. 구조는 말로 설명한다 |
| 트랙 B 과제 (4시간) | B 또는 B + 기능 기준 패키지 | 규칙은 도메인에, 인프라는 service/repository 뒤에 |
| 트랙 B에 Kafka·Redis·실시간이 모두 붙을 때 | C 를 부분 적용 (outbound port 만 분리 등) | 인프라가 늘어난 지점만 추상화 |

## 4. 결정할 때 스스로 답할 질문

1. 이 구조가 **지금 요구사항에서** 막아 주는 문제는 무엇인가?
2. 규칙(도메인 로직)은 어디에 있고, 프레임워크 없이 테스트할 수 있는가?
3. 트랜잭션 경계와 락 범위는 어느 레이어에서 정하는가?
4. JPA 엔티티를 API 응답으로 그대로 내보내는가? 아니라면 변환은 어디서 하는가?
5. 인프라(Redis 락 → DB 락)를 바꾸면 몇 개의 파일이 바뀌는가?
6. 이 구조의 **비용**(파일 수, 매핑 코드)은 무엇이고, 그 비용을 감수할 이유가 있는가?

## 5. 결정을 테스트로 강제하기 (ArchUnit)

결정한 규칙은 문서로만 두면 지켜지지 않는다. `track-b-assignment`에는 ArchUnit 이 들어 있고,
`acceptance/Stage1ArchitectureTest`(잠김)에 **내가 고른 규칙**을 테스트로 작성한다.

ArchUnit 일반 사용법 (특정 구조를 권하는 예시가 아니다):

```java
// 규칙 예: "..web.. 패키지는 ..persistence.. 패키지에 의존하지 않는다"
ArchRule rule = noClasses().that().resideInAPackage("..web..")
        .should().dependOnClassesThat().resideInAPackage("..persistence..");

// 규칙 예: 기능 패키지 간 순환 의존 금지
ArchRule noCycles = slices().matching("com.example.(*)..").should().beFreeOfCycles();

// 규칙 예: 레이어 선언
ArchRule layers = layeredArchitecture().consideringAllDependencies()
        .layer("Web").definedBy("..web..")
        .layer("App").definedBy("..app..")
        .whereLayer("Web").mayNotBeAccessedByAnyLayer();
```

## 6. 면접 꼬리 질문 대비

- "왜 이 구조를 골랐나요? 다른 구조였다면 무엇이 달라지나요?"
- "도메인 모델과 JPA 엔티티를 분리했나요? 분리 비용은?"
- "서비스가 커지면 어디부터 쪼개겠어요?"
- "이 구조에서 Redis 락을 DB 락으로 바꾸면 어디를 고치나요?"
