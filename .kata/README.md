# .kata — 진행 기록

`./kata` CLI와 Claude 스킬이 쓰는 파일이다. 직접 고칠 일은 거의 없다.

| 파일 | 내용 |
|---|---|
| `state/<문제>` | 현재 단계, 시작 시각 (`./kata reset <문제>`로 초기화) |
| `history.tsv` | 단계별 소요 시간 기록 (README 진행 현황 표의 원본) |
| `hints.log` | `/hint`, `/solution` 사용 기록 (회고에서 사용) |
| `SCAFFOLD_MODE` | 존재하면 하네스 가드 해제 (레포 관리 작업용, 커밋하지 않는다) |
