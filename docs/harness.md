# 하네스 — Claude Code를 "코치"로 쓰기 위한 장치

AI가 옆에 있으면 가장 쉬운 길은 "정답 받아 적기"다. 이 레포의 하네스는 그 길을 막고,
**질문 → 힌트 → 리뷰 → 모범답안**의 순서를 강제하며, 시간과 도움 사용량을 기록한다.

## 계층

```
┌─────────────────────────────────────────────────────────────┐
│ 1. 규칙      CLAUDE.md          코치 역할, 절대 규칙, 레포 지도      │  ← 부탁
├─────────────────────────────────────────────────────────────┤
│ 2. 절차      .claude/skills/    /kata-start /interviewer /hint     │  ← 표준화
│                                 /review /solution /next-stage      │
│                                 /retro /sdd /tech-radar            │
├─────────────────────────────────────────────────────────────┤
│ 3. 강제      .claude/hooks/     guard-solution: src/tests 쓰기 차단 │  ← 강제
│                                 guard-stages: 미도달 단계 읽기 차단 │
│              SessionStart       ./kata status 를 컨텍스트에 주입    │
├─────────────────────────────────────────────────────────────┤
│ 4. 측정      ./kata, .kata/     타이머, 단계 게이트, 시간/힌트 기록 │  ← 피드백
├─────────────────────────────────────────────────────────────┤
│ 5. 검증      테스트, CI         잠긴 테스트(🔒), gradle/npm, Actions│  ← 진실
└─────────────────────────────────────────────────────────────┘
```

- **규칙(1)** 만으로는 부족하다. 모델은 "도와주려는" 방향으로 규칙을 넘기 쉽다.
- 그래서 결정적으로 막아야 하는 두 가지(정답 코드 작성, 다음 단계 누설)는 **훅(3)** 으로 강제한다.
  훅은 종료 코드 2로 도구 호출을 거부하고, 그 이유를 Claude에게 돌려준다.
- 단계 진행은 사람의 선언이 아니라 **테스트 통과(5)** 로만 일어난다. (`./kata next`)
- 시간과 도움 사용량은 **자동으로 기록(4)** 되어 회고의 재료가 된다.

## 흐름

```
/kata-start p1 ──► NOTES.md 질문 목록 ──► /interviewer (질문)
                                             │
      ┌──────────────── 구현 (사용자) ◄──────┘
      │        막힘 ──► /hint (L1 → L2 → L3, hints.log 기록)
      │        완료 ──► /review ──► /interviewer 꼬리질문
      ▼
/next-stage p1 ──(잠금 해제 + 테스트 통과)──► 다음 stage 공개, 시간 기록
      │
      ▼ (마지막 단계)
/retro p1 ──► retros/<날짜>.md (측정값 자동 + 주관 항목 문답)
```

`/solution`은 `disable-model-invocation: true`라서 **사용자가 직접 입력했을 때만** 실행된다.

## 한계 (알고 쓰기)

- 훅은 Claude의 `Write/Edit/Read` 도구만 본다. Bash(`cat > file`)로 우회할 수 있으며, 이를 막는 것은 CLAUDE.md 규칙이다.
- 사람이 `stages/` 파일을 여는 것은 막지 않는다. 스포일러 방지는 결국 본인의 약속이다.
- 레포 관리(새 문제 추가)를 할 때는 `touch .kata/SCAFFOLD_MODE`로 가드를 잠시 해제하고, 끝나면 지운다.

## 파일

| 파일 | 역할 |
|---|---|
| `CLAUDE.md` | Claude가 매 세션 읽는 규칙 |
| `.claude/settings.json` | 훅 연결, 자주 쓰는 명령 허용 |
| `.claude/hooks/guard-solution.sh` | `track-*/src/**`, `track-c-frontend/tests/**` 쓰기 차단 |
| `.claude/hooks/guard-stages.sh` | 트랙 A에서 현재 단계보다 뒤의 `stage-N.md`, `Stage{N}Test.java` 읽기 차단 |
| `.claude/skills/*/SKILL.md` | 슬래시 명령 9개 |
| `docs/guides/clean-code.md` | `/review`가 지적 근거로 인용하는 체크리스트 (ID 체계) |
| `track-b-assignment/.../Stage1ArchitectureTest` | ADR-0000 의 아키텍처 결정을 ArchUnit 으로 강제 |
| `kata` | 타이머·단계 게이트·기록 CLI (bash 3.2 호환, macOS 기본 bash에서도 동작) |
