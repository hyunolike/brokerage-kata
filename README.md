# brokerage-kata

증권 도메인(주문, 호가, 잔고·손익, 예수금 동시성)을 소재로 **설계와 구현을 반복 연습**하는 개인 공부 레포입니다.
정답 코드는 없습니다. 문제와 시작 코드, 잠긴 테스트 골격만 있고, 제가 직접 풀면서 기록을 남깁니다.

- **짧게, 자주** — 40~60분짜리 문제를 타이머를 켜고 푼다
- **요구사항은 단계적으로** — 다음 단계는 이전 단계를 끝내야 연다 (변경에 강한 설계를 연습)
- **Spec이 먼저** — 긴 과제는 SDD(Spec-Driven Development)로 spec → plan → tasks → 테스트 → 구현
- **AI는 코치로만** — Claude Code 하네스로 "정답을 대신 써 주지 않는" 규칙을 강제한다
- **회고로 끝낸다** — 시간, 막힌 지점, 놓친 질문을 기록하고 다음 회차에 반영한다

## 구성

| 트랙 | 형태 | 기술 | 문제 |
|---|---|---|---|
| [A. 라이브 코딩](track-a-live-coding) | 40~60분, 단계별 요구사항 공개 | Java 21 또는 Kotlin (프레임워크 없음) | [p1 주문 접수](track-a-live-coding/p1-order-intake) · [p2 호가창 체결](track-a-live-coding/p2-order-book) · [p3 잔고·손익](track-a-live-coding/p3-portfolio-pnl) · [p4 예수금 동시성](track-a-live-coding/p4-concurrent-cash) · [p5 레거시 리팩터링](track-a-live-coding/p5-refactor-legacy) |
| [B. 과제](track-b-assignment) | 3~4시간 + 확장, SDD | Spring Boot 3, JPA, H2/MySQL, Redis, Docker Compose, ArchUnit · 확장: Kafka, WebSocket/SSE, Prometheus/Grafana | 모의 주식 주문 API 서버 |
| [C. 프론트엔드](track-c-frontend) | 3~4시간, SDD | React, TypeScript, Vite, Vitest | B의 API를 쓰는 주문 웹 |

B와 C는 [`contracts/brokerage-api.yaml`](contracts) 계약으로 연결됩니다.
B의 확장 spec(007~009)과 Kotlin 풀이는 증권·핀테크 채용공고에서 자주 보이는 기술을 조사해 추가했습니다 → [기술 레이더](docs/tech-radar.md)

## 설계 기준

정답 구조를 정해 두지 않고, **선택지와 판단 기준**을 두고 스스로 고릅니다. 고른 이유는 ADR로 남기고, 규칙은 테스트로 강제합니다.

| 가이드 | 내용 |
|---|---|
| [아키텍처](docs/guides/architecture.md) | 계층형 / 풍부한 도메인 / 헥사고날, 패키지 구조, ArchUnit으로 강제하기 |
| [프론트엔드 아키텍처](docs/guides/frontend-architecture.md) | 상태 분류, 서버 상태 관리, 폴더 구조, API 계층, 컴포넌트 구성 |
| [디자인 패턴](docs/guides/design-patterns.md) | "이런 신호가 보이면 이 패턴을 검토" 카탈로그 (문제별 정답 매핑은 일부러 없음) |
| [클린코드](docs/guides/clean-code.md) | ID가 붙은 체크리스트. `/review`가 이 ID로 지적한다 |
| [Kotlin으로 풀기](docs/guides/kotlin.md) | 트랙 A 2회차를 Kotlin으로 |

## 빠른 시작

```bash
./gradlew test                       # Java 전체 — 잠긴 테스트는 skip
(cd track-c-frontend && npm install && npm test)

./kata list                          # 문제 목록
./kata start p1                      # 타이머 시작 + 현재 단계 안내
```

## 한 문제를 푸는 순서

```
타이머 시작 → 질문 목록 작성 → (테스트 → 구현)×단계 → 회고
./kata start    NOTES.md / plan.md    ./kata next        /retro
```

1. **타이머 시작** — `./kata start p1`. 현재 단계 문서와 잠금 해제할 테스트를 알려준다.
2. **질문 목록 작성 (5분)** — 문제의 `NOTES.md`에 모호한 점을 적는다. `/interviewer`로 Claude에게 면접관 역할을 맡겨 답을 받을 수 있다.
3. **테스트 → 구현** — `Stage{N}Test`의 `@Disabled`(프론트엔드는 `describe.skip`)를 지우고 테스트를 채운 뒤 구현한다.
4. **다음 단계** — `./kata next p1`. 잠금이 풀려 있고 테스트가 통과해야 다음 단계 문서가 열린다. 소요 시간은 아래 표에 자동 기록된다.
5. **회고** — `/retro p1` 또는 [`RETRO_TEMPLATE.md`](RETRO_TEMPLATE.md)를 복사해 작성한다.

> 같은 문제를 여러 번 푸는 것이 목적이므로, 풀이는 `practice/p1-1` 같은 브랜치에서 하고 기본 브랜치는 시작 상태로 둡니다.

## Claude Code와 함께 공부하기 (하네스)

이 레포는 Claude Code가 **코치**로만 행동하도록 하네스를 갖추고 있습니다. 자세한 구조는 [docs/harness.md](docs/harness.md).

| 명령 | 하는 일 |
|---|---|
| `/kata-start p1` | 타이머 시작, 현재 단계 안내 |
| `/interviewer` | 면접관 역할로 질문에 답함 (다음 단계는 누설하지 않음) |
| `/hint` | 힌트 1단계씩 (방향 → 개념 → 구조). 코드는 주지 않음 |
| `/review` | 현재 코드 리뷰 + 면접관 꼬리 질문 |
| `/solution` | 모범답안 (내가 직접 호출할 때만, 대화창에만 출력) |
| `/next-stage p1` | 테스트 확인 후 다음 단계로 |
| `/retro p1` | 측정값을 채운 회고 초안 생성 |
| `/sdd 002` | 트랙 B·C의 spec ↔ plan ↔ tasks ↔ 테스트 ↔ ADR 정합성 검토 |
| `/tech-radar` | 채용공고를 다시 조사해 기술 레이더 갱신, 연습 공백 제안 |

강제 장치: `src/`·`tests/`에 Claude가 코드를 쓰려 하면 훅이 막고, 아직 도달하지 않은 단계 문서를 읽으려 해도 막습니다.

## SDD (Spec-Driven Development)

```
constitution.md ─ 불변 원칙
spec.md    무엇을/왜     (주어짐)
plan.md    어떻게        (내가 씀: API, 데이터 모델, 대안 비교)
tasks.md   작업 분해     (내가 씀: 테스트 작업이 먼저)
tests      수용 기준(AC) = 테스트 이름
code       구현
```

트랙 A는 `stages/*.md`가 spec, `NOTES.md`가 가벼운 plan/tasks 역할을 합니다. 자세한 내용은 [docs/sdd.md](docs/sdd.md), 템플릿은 [templates/](templates).

## 진행 현황

`./kata next`가 단계를 마칠 때마다 자동으로 채웁니다. 같은 문제를 다시 풀면 표 아래에 행이 추가됩니다.

| 문제 | 단계 | 소요 시간 | 날짜 |
|---|---|---|---|
| p1-order-intake | 1 | - | - |
| p1-order-intake | 2 | - | - |
| p1-order-intake | 3 | - | - |
| p1-order-intake | 4 | - | - |
| p2-order-book | 1 | - | - |
| p2-order-book | 2 | - | - |
| p2-order-book | 3 | - | - |
| p3-portfolio-pnl | 1 | - | - |
| p3-portfolio-pnl | 2 | - | - |
| p3-portfolio-pnl | 3 | - | - |
| p3-portfolio-pnl | 4 | - | - |
| p4-concurrent-cash | 1 | - | - |
| p4-concurrent-cash | 2 | - | - |
| p4-concurrent-cash | 3 | - | - |
| p5-refactor-legacy | 1 | - | - |
| p5-refactor-legacy | 2 | - | - |
| p5-refactor-legacy | 3 | - | - |
| track-b-assignment | 1 | - | - |
| track-b-assignment | 2 | - | - |
| track-b-assignment | 3 | - | - |
| track-b-assignment | 4 | - | - |
| track-b-assignment | 5 | - | - |
| track-b-assignment | 6 | - | - |
| track-b-assignment | 7 | - | - |
| track-b-assignment | 8 | - | - |
| track-b-assignment | 9 | - | - |
| track-c-frontend | 1 | - | - |
| track-c-frontend | 2 | - | - |
| track-c-frontend | 3 | - | - |
| track-c-frontend | 4 | - | - |
| track-c-frontend | 5 | - | - |
| track-c-frontend | 6 | - | - |
<!-- progress:end -->

## 레포 구조

```
brokerage-kata/
├── README.md               진행 방법, 진행 현황
├── RETRO_TEMPLATE.md       회고 템플릿
├── CLAUDE.md               하네스: Claude 행동 규칙
├── kata                    타이머·단계 진행 CLI
├── .claude/                하네스: skills(슬래시 명령), hooks
├── .kata/                  진행 상태, 소요 시간 기록
├── docs/                   harness.md, sdd.md, tech-radar.md
│   └── guides/             architecture, design-patterns, clean-code, kotlin
├── templates/              spec / plan / tasks / ADR 템플릿
├── contracts/              트랙 B ↔ C API 계약 (OpenAPI)
├── track-a-live-coding/    p1 ~ p5 (Gradle 서브프로젝트, Java/Kotlin)
│   └── pN-*/  README.md, NOTES.md, stages/, src/main, src/test
├── track-b-assignment/     Spring Boot (Gradle 서브프로젝트)
│   └── specs/(001~009), docs/adr/, docker-compose.yml, src/
└── track-c-frontend/       React + Vite (npm)
    └── specs/(001~006), src/, tests/
```
