# SDD — Spec-Driven Development

코드를 쓰기 전에 **무엇을(spec) → 어떻게(plan) → 어떤 순서로(tasks)** 를 문서로 확정하고,
수용 기준(AC)을 테스트 이름으로 그대로 옮겨 **spec과 코드가 추적 가능하게** 만드는 방식이다.

## 산출물

| 산출물 | 누가 | 질문 | 이 레포에서 |
|---|---|---|---|
| constitution | 주어짐 | 무엇을 절대 어기지 않는가 | `track-*/specs/constitution.md` |
| spec | 주어짐 | 무엇을, 왜 | `specs/NNN-*/spec.md` — FR, AC, 범위 밖, 열린 질문 |
| plan | **나** | 어떻게 | `plan.md` — 결정, API, 데이터 모델, 대안, AC↔테스트 매핑 |
| tasks | **나** | 어떤 순서로 | `tasks.md` — 30분 이하 작업, 테스트 먼저 |
| contract | **나** (plan 단계) | B와 C가 무엇에 합의했나 | `contracts/brokerage-api.yaml` |
| ADR | **나** | 왜 그 대안을 골랐나 | `track-b-assignment/docs/adr/` |
| tests | **나** | AC가 지켜지는가 | 테스트 이름 = `AC-NNN-N ...` |

## 트랙별 적용

### 트랙 A (라이브 코딩, 40~60분) — 가벼운 SDD
- spec = `stages/stage-N.md` (단계별로 공개)
- plan/tasks = `NOTES.md` 한 장 (질문 목록 → 가정 → 설계 메모 → 테스트 목록)
- 목적: **5분 안에 질문하고 가정을 적는 습관**, 요구사항 변경이 설계에 주는 충격을 체감

### 트랙 B (백엔드 과제, 3~4시간) — 정식 SDD
1. 전체 spec을 읽고 열린 질문에 답한다 (15분)
2. spec마다: `plan.md` + 계약 갱신 → `tasks.md` → `/sdd NNN`으로 검토 → 테스트 → 구현 → `./kata next b`
3. 선택이 갈리는 결정(동시성 제어, 멱등성, 응답 포맷, 테스트 격리)은 ADR로 남긴다

### 트랙 C (프론트엔드) — 계약 우선
- 트랙 B plan에서 확정한 **계약**을 기준으로 화면을 만든다
- 백엔드가 없으면 계약의 예시로 목(mock)을 만들고, 나중에 실제 서버로 바꿔 끼운다

## 추적성 예시

```
spec  AC-002-2  "주문 가능 금액 부족 시 실패, 잔고 변화 없음"
plan  | AC-002-2 | Stage2Test.rejectInsufficientCash |
tasks - [ ] T3 (test) AC-002-2 잔고 부족 테스트 — 실패 확인
test  @DisplayName("AC-002-2 주문 가능 금액이 부족하면 실패하고 잔고는 그대로다")
```

`/sdd 002 trace`는 이 연결이 끊긴 곳을 표로 보여준다.
