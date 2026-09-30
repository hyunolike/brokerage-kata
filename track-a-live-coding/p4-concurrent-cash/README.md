# p4. 예수금 동시성 (Concurrent Cash)

> 동시성 제어 + 원자성 · 제한 시간 **50분** (3단계)

## 배경

주문을 내면 계좌의 **예수금(주문 가능 금액)** 에서 주문 금액이 빠진다.
같은 계좌로 여러 기기에서 동시에 주문이 들어와도 **예수금을 초과해 주문이 나가면 안 된다.**
이 문제는 단일 JVM 안에서 풀고, 여러 서버로 확장할 때의 방안은 말로 설명한다.

## 단계 구성

| 단계 | 파일 | 권장 시간 |
|---|---|---|
| 1 | `stages/stage-1.md` | 10분 |
| 2 | `stages/stage-2.md` | 20분 |
| 3 | `stages/stage-3.md` | 20분 |

> ⚠️ 현재 단계를 끝내기 전에는 다음 단계 파일과 다음 단계 테스트 파일을 열지 않는다.

## 평가 포인트

- **락 범위** — 전역 락 vs 계좌별 락. 서로 다른 계좌가 서로를 기다리지 않는가
- **원자성** — "잔액 확인 → 차감"이 쪼개지지 않는가 (check-then-act)
- 도구 선택 근거 — `synchronized` / `ReentrantLock` / `AtomicLong` + CAS / `ConcurrentHashMap.compute`
- **멀티스레드 테스트** — `ExecutorService` + `CountDownLatch`로 동시에 출발시키고, 결과를 결정적으로 검증하는가
- **멀티 인스턴스 확장** — DB 비관적 락 / 조건부 UPDATE / 낙관적 락 / Redis 분산락의 장단점을 설명할 수 있는가

## 시작 방법

```bash
./kata start p4
```

1. 타이머 시작 → 2. `NOTES.md`에 질문 목록 → 3. `Stage{N}Test.java` 잠금 해제 후 구현 → 4. `./kata next p4` → 5. `/retro p4`

## 시작 코드

- `CashService.java` — 진입점. 시그니처는 자유롭게 바꿔도 된다.
