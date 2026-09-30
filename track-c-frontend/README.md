# 트랙 C. 프론트엔드 — 모의 주식 주문 웹

> React · TypeScript · Vite · Vitest · Testing Library · 권장 3~4시간

## 개요

트랙 B에서 만든 **모의 주식 주문 API**를 사용하는 웹 화면을 만든다.
백엔드 개발자로서 "내 API를 쓰는 쪽"의 입장을 경험하는 것이 목적이다.
API 계약(`/contracts/brokerage-api.yaml`)을 사이에 두고 트랙 B와 **계약 우선(contract-first)** 으로 맞물린다.

| 순서 | Spec | 내용 | 의존하는 트랙 B spec |
|---|---|---|---|
| 1 | [`001-account-dashboard`](specs/001-account-dashboard/spec.md) | 계좌 개설, 입금, 잔고 | 001 |
| 2 | [`002-order-form`](specs/002-order-form/spec.md) | 주문 폼, 클라이언트 검증, 중복 제출 방지 | 002, 003 |
| 3 | [`003-order-list`](specs/003-order-list/spec.md) | 주문 내역, 취소 | 002 |
| 4 | [`004-error-handling`](specs/004-error-handling/spec.md) | 공통 에러 처리 | 004 |
| 5 | [`005-integration`](specs/005-integration/spec.md) | 백엔드 연동, 계약 동기화 | 006 |

## 진행 방법 (SDD)

트랙 B와 같다: `spec.md` → `plan.md` → `tasks.md` → 테스트(`tests/stage-N-*.test.tsx`의 `describe.skip` 해제) → 구현

```bash
cd track-c-frontend
npm install
npm test            # 잠긴 테스트는 skip
npm run dev         # http://localhost:5173
npm run typecheck

./kata start c      # (레포 루트에서) 타이머 시작
./kata next c       # 현재 spec 테스트 통과 시 다음 spec 으로
```

**백엔드 없이 시작하기** — 트랙 B가 아직이라면 plan 단계에서 목(mock) 전략을 먼저 정한다. (MSW 등은 필요할 때 직접 설치하고 plan에 근거를 남긴다)

## 시작 코드

| 파일 | 내용 |
|---|---|
| `src/App.tsx` | 빈 앱 셸 |
| `src/api/client.ts` | `request()` 시그니처만 (spec 001, 004에서 구현) |
| `src/lib/money.ts` | `formatKrw()` 시그니처만 (spec 001) |
| `tests/` | spec별 테스트 골격 (잠김) |
