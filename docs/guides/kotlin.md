# Kotlin 으로 풀기 (트랙 A)

채용공고 대부분이 **Java/Kotlin + Spring**을 함께 요구한다([tech-radar](../tech-radar.md)).
트랙 A 빌드는 Kotlin 을 함께 컴파일하므로, 같은 문제를 **2회차는 Kotlin 으로** 풀어 보는 것을 권한다.

## 설정 (이미 되어 있음)

- `buildSrc`의 `kata.java-conventions`가 `org.jetbrains.kotlin.jvm` 플러그인을 적용한다 (JVM 21).
- `src/main/kotlin`, `src/test/kotlin`에 둔 코드가 Java 코드와 함께 컴파일되고 서로 호출할 수 있다.

## 진행 방법

1. 풀이 브랜치를 만든다: `git switch -c practice/p1-kotlin`
2. 시작 코드(`src/main/java/...`)를 지우고 같은 패키지로 `src/main/kotlin/kata/p1/`에 Kotlin 으로 다시 만든다.
3. 테스트는 두 가지 중 하나:
   - Java 테스트 골격(`Stage{N}Test.java`)을 그대로 쓰고 Kotlin 코드를 호출한다.
   - `src/test/kotlin/`에 Kotlin 테스트를 새로 쓴다. **잠금 표식을 유지한다**: 클래스에 `@Disabled("🔒 stage-N: ...")`를 붙여 두었다가 풀면 `./kata next`가 그대로 동작한다. Java 골격을 쓰지 않는다면 해당 파일을 지운다.
4. 나머지 흐름(`./kata start/next`, `/review`, `/retro`)은 같다. `/review`는 [clean-code.md](clean-code.md)의 `CC-K*` 항목도 본다.

## Java → Kotlin 에서 특히 연습할 것

| 주제 | 확인할 점 |
|---|---|
| null 안전성 | 플랫폼 타입, `!!` 없이 설계하기 |
| 불변 | `val`, 읽기 전용 컬렉션 인터페이스와 실제 불변의 차이 |
| 값 표현 | `data class`, `@JvmInline value class`, `init` 블록 검증 |
| 상태/결과 | `sealed interface` + `when` 의 완전성 검사 |
| BigDecimal | 연산자 오버로딩(`+`, `*`)과 `compareTo` 기반 비교, `setScale` |
| 동시성 | `synchronized` 블록, `java.util.concurrent` 그대로 사용 (코루틴은 이 레포 범위 밖) |
| 확장 함수 | 편하지만 규칙을 도메인 밖으로 흩뜨리지 않는지 |

## 트랙 B 를 Kotlin 으로?

Spring + JPA + Kotlin 은 `kotlin-spring`(all-open), `kotlin-jpa`(no-arg) 플러그인 설정이 추가로 필요하다.
트랙 B 를 Kotlin 으로 하고 싶다면 레포 관리 작업으로 요청한다. (ADR 로 남길 가치가 있는 결정이다)
