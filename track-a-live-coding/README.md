# 트랙 A. 라이브 코딩

순수 Java 21 (프레임워크 없음) · JUnit 5 · AssertJ · 문제당 40~60분

| 문제 | 주제 | 단계 | 시간 | 핵심 평가 포인트 |
|---|---|---|---|---|
| [p1-order-intake](p1-order-intake) | 주문 접수, 도메인 모델링 | 4 | 50분 | 변경에 강한 설계, 상태 전이 |
| [p2-order-book](p2-order-book) | 호가창 체결 엔진 | 3 | 50분 | 자료구조 선택 근거, 시간 복잡도 |
| [p3-portfolio-pnl](p3-portfolio-pnl) | 잔고, 손익 계산 | 4 | 60분 | BigDecimal, 반올림 정책, 엣지 케이스 |
| [p4-concurrent-cash](p4-concurrent-cash) | 예수금 동시성 | 3 | 50분 | 락 범위, 원자성, 멀티 인스턴스 확장 |
| [p5-refactor-legacy](p5-refactor-legacy) | 레거시 리팩터링 | 3 | 60분 | 테스트 먼저, 안전한 리팩터링 |

## 규칙

- 다음 단계 요구사항(`stages/stage-{N+1}.md`)과 테스트(`Stage{N+1}Test.java`)는 현재 단계를 끝내기 전에 열지 않는다.
- 시작 코드의 시그니처는 바꿔도 된다. (실제 면접이라면 먼저 물어보자)
- 테스트 골격의 시나리오는 최소 목록이다. 더 추가하는 것이 좋다.

```bash
./kata start p1
./gradlew :track-a-live-coding:p1-order-intake:test
./kata next p1
```
