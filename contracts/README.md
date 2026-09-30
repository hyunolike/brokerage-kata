# contracts — API 계약

트랙 B(백엔드)와 트랙 C(프론트엔드)가 공유하는 **단일 진실 공급원**이다.

- `brokerage-api.yaml` — OpenAPI 3.1 문서. **트랙 B의 각 spec plan 단계에서 직접 채운다.**
- 계약이 바뀌면 백엔드 통합 테스트와 프론트엔드 목(mock)이 함께 바뀌어야 한다.
- SDD 순서: `spec.md`(무엇) → `plan.md`에서 계약 갱신(어떻게) → 테스트 → 구현
