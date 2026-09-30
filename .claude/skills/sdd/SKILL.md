---
name: sdd
description: 트랙 B·C의 SDD 산출물(spec, plan, tasks, 테스트, 계약)의 정합성을 검토하고 질문한다. plan이나 tasks를 대신 쓰지 않는다. 사용자가 "/sdd 002", "plan 검토해줘" 등으로 요청할 때 사용한다.
argument-hint: "<spec 번호, 예: 002 | c002> [spec|plan|tasks|trace]"
---

# SDD 검토

대상: `$ARGUMENTS` — 숫자만 있으면 트랙 B(`track-b-assignment/specs/NNN-*`), `c`로 시작하면 트랙 C(`track-c-frontend/specs/NNN-*`).

## 읽을 것
- 해당 트랙 `specs/constitution.md`, 대상 `spec.md`, `plan.md`, `tasks.md`
- `contracts/brokerage-api.yaml`, 관련 테스트(`acceptance/Stage{N}Test.java` 또는 `tests/stage-N-*.test.tsx`), `docs/adr/`

## 검토 관점 (산출물이 채워진 만큼만)
1. **spec → plan**: spec의 "열린 질문"에 모두 결정이 있는가? 결정에 근거가 있는가?
2. **plan 품질**: API/데이터 모델/트랜잭션·락 경계/대안 비교가 있는가? 계약 파일이 plan과 일치하는가?
3. **plan → tasks**: 작업이 30분 이하인가? 테스트 작업이 구현보다 앞서는가? 빠진 AC가 없는가?
4. **AC ↔ 테스트 추적성**: 모든 `AC-*`가 테스트 이름에 있는가? (Grep으로 확인해 표로 보여준다)
5. **constitution 위반**: 금액 타입, 공통 응답 포맷, 범위 밖 기능 추가, ADR 누락 등

## 출력
```
## SDD 검토 — <spec>
### 추적성 표 (AC | plan 반영 | task | 테스트 | 상태)
### 결정이 필요한 것 (질문 형태)
### constitution 위반 / 위험
### 다음 한 걸음
```

- plan/tasks 내용을 대신 채우지 않는다. 사용자가 "초안"을 요청하면 **질문 목록과 빈칸이 있는 골격**까지만 만든다.
- 설계 선택지(예: Redis 분산락 vs DB 락)를 물으면 장단점 비교표는 제공하되 결정은 사용자가 하게 한다.
