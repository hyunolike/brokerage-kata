# 트랙 B. 과제 — 모의 주식 주문 API 서버

> 제한 시간 **3~4시간** · Spring Boot 3 · JPA · H2 / MySQL · Redis · Docker Compose

## 과제 개요

계좌를 만들고, 입금하고, 지정가 매수 주문을 내고 취소할 수 있는 **모의 주식 주문 API 서버**를 만든다.
요구사항은 SDD(Spec-Driven Development) 방식으로 `specs/`에 나뉘어 있다.

| 순서 | Spec | 내용 | 권장 시간 |
|---|---|---|---|
| 1 | [`001-account`](specs/001-account/spec.md) | 계좌 생성, 입금, 잔고 조회 | 30분 |
| 2 | [`002-order`](specs/002-order/spec.md) | 주문 생성 / 취소 / 조회 | 60분 |
| 3 | [`003-concurrency`](specs/003-concurrency/spec.md) | 동시성, 멱등성 (Redis 분산락 vs DB 락 선택) | 50분 |
| 4 | [`004-error-response`](specs/004-error-response/spec.md) | 예외 처리와 공통 응답 포맷 | 30분 |
| 5 | [`005-integration-test`](specs/005-integration-test/spec.md) | 통합 테스트 | 30분 |
| 6 | [`006-docker`](specs/006-docker/spec.md) | `docker compose up` 한 번으로 실행 | 20분 |

과제 테스트는 요구사항 전체가 처음부터 주어지므로 **모든 spec을 먼저 읽어도 된다.** (트랙 A와 다름)

## 진행 방법 (SDD)

```
constitution.md (불변 원칙)
  └─ spec.md (무엇/왜, 주어짐) → plan.md (어떻게, 내가 씀) → tasks.md (작업 분해) → 테스트 → 구현
```

1. **타이머 시작** — `./kata start b`
2. **전체 spec 읽고 질문 목록 작성** — 각 spec의 "열린 질문"에 답을 정한다 (15분)
3. **spec마다** plan → tasks → 테스트(`acceptance/Stage{N}Test` 잠금 해제) → 구현 → `./kata next b`
4. **제출물 작성** — 아래 "제출용 README" 섹션을 채운다
5. **회고** — `/retro b`

Claude 사용: `/sdd 002`로 plan·tasks 검토, `/review`로 코드 리뷰, `/hint`로 힌트.

## 실행 (스캐폴딩 상태)

```bash
./gradlew :track-b-assignment:test        # 스모크 테스트 1개 통과, 나머지는 잠김(skip)
./gradlew :track-b-assignment:bootRun     # H2 인메모리로 실행
docker compose -f track-b-assignment/docker-compose.yml up mysql redis   # 인프라만
```

---

# 제출용 README (과제 완료 후 아래를 채운다)

## 실행 방법

```bash
# TODO(006)
```

## API 명세

<!-- 계약: /contracts/brokerage-api.yaml. 여기에는 요약 표 + curl 예시 -->

| Method | Path | 설명 |
|---|---|---|
| | | |

### 에러 코드

| 코드 | HTTP | 의미 |
|---|---|---|
| | | |

## ERD

```mermaid
erDiagram
    %% TODO
```

## 설계 결정

| 결정 | 선택 | 대안 | 근거 (ADR) |
|---|---|---|---|
| 동시성 제어 | | Redis 분산락 / 비관적 락 / 낙관적 락 / 조건부 UPDATE | [ADR-0001](docs/adr/) |
| 멱등성 | | | |
| 공통 응답 포맷 | | | |
| 테스트 격리 | | | |

## 못 한 것 / 다음에 할 것

-
