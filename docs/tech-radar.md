# 기술 레이더 — 채용공고로 본 실무 기술

> 증권·핀테크 서버 개발자 채용공고에서 반복해서 보이는 기술과, 이 레포에서 어디서 연습하는지.
> 갱신: `/tech-radar` (Claude가 공고를 다시 검색해 이 문서를 고친다)

- 마지막 조사: **2026-09-30**
- 조사 방법: 웹 검색 결과 요약 기반 (공고 원문 페이지는 확인하지 못함 — 세부 문구는 원문으로 재확인할 것)

## 요약

| 기술/역량 | 등장 빈도 | 대표 공고 | 이 레포에서 |
|---|---|---|---|
| Java / **Kotlin** + Spring (Boot) | 매우 높음 — 대부분 "Java/Kotlin" 병기 | 토스증권, 두나무, 넥스트증권, 카카오페이증권 | 트랙 A·B (Java), [Kotlin 2회차](guides/kotlin.md) |
| JPA / Hibernate, MySQL | 높음 | 토스증권 기술 스택 | 트랙 B |
| Redis | 높음 | 넥스트증권(필수), 토스증권(우대) | 트랙 B 003 |
| **Kafka / 이벤트 기반 아키텍처** | 높음 | 넥스트증권(필수), 토스증권(우대), 카카오페이증권(EDA) | 트랙 B 007 |
| 멱등성·동시성·트랜잭션 제어 | 높음 | 두나무(필수) | 트랙 A p4, 트랙 B 003·007 |
| OOP·디자인 패턴 기반 금융 도메인 설계 | 중간 | 카카오페이증권 | 트랙 A 전체, [가이드](guides/design-patterns.md) |
| 실시간·저지연 처리 (API/WebSocket) | 중간 | 토스증권 시세(Market Platform) | 트랙 B 008, 트랙 C C006 |
| 관측성 (Grafana, OpenTelemetry, ELK) | 중간 | 카카오페이증권, 토스증권 | 트랙 B 009 |
| MSA, gRPC, 파티셔닝/샤딩 | 낮음~중간 (시니어 공고 위주) | 카카오페이증권 | 범위 밖 — 설계 질문으로만 |
| JVM·네트워크·인프라 트러블슈팅, 성능 튜닝 | 중간 (우대) | 토스증권 | 범위 밖 — 회고/꼬리 질문으로 |
| Go | 낮음 (특정 팀) | 토스증권 시세팀 | 범위 밖 |

## 공고별 메모

| 회사 · 포지션 | 핵심 요구 |
|---|---|
| 토스증권 Server Developer | Java/Kotlin, Spring 능숙. 우대: Redis, Kafka, ELK 운영, Spring·JVM·OS·네트워크 트러블슈팅, 성능 튜닝. 스택: Java, Kotlin, Spring, JPA/Hibernate, Netty, MySQL, Oracle, Redis, MongoDB, Kafka, Elasticsearch, InfluxDB, Grafana |
| 토스증권 Server Developer (Market Platform) | 대고객 API/WebSocket ~ 대외기관 통신, 실시간 대용량·저지연 이벤트 처리. Go, Kotlin, Spring 선호 |
| 넥스트증권 Backend Engineer (Trading Product) | Java/Kotlin, Spring Boot, RDB, Redis, Kafka. Kafka 중심 분산 이벤트 스트리밍 구축·운영 경험 |
| 넥스트증권 Backend Engineer (Core Trading Platform) | 국내 주문·체결·잔고 시스템, 시장 세션 처리, 대량 주문·실시간 체결 이벤트 |
| 두나무 Backend Engineer (증권플러스) | Spring(Kotlin/Java). **멱등성, 실시간성, 동시성, 트랜잭션**을 도메인 특성에 맞게 제어한 경험 (필수). 고가용성·장애 대응 설계 |
| 카카오페이증권 서버 개발자 | Java/Kotlin/Scala, Spring/Akka, RDBMS 모델링·튜닝. OOP·디자인 패턴 기반 금융 설계, MSA·EDA, gRPC, 파티셔닝/샤딩, OpenTelemetry·Grafana·OpenSearch·Sentry |

## 이 레포에 반영한 것 / 반영하지 않은 것

- 반영: Kotlin 선택 가능(트랙 A), Kafka·아웃박스·멱등 소비자(B 007), 실시간 푸시(B 008, C006), 관측성(B 009), 아키텍처·패턴·클린코드 가이드
- 미반영(이유): MSA/gRPC/샤딩 — 혼자 하는 코딩 연습으로 재현하기 어려움. 대신 `/interviewer 꼬리질문`의 설계 토론 주제로 사용

## 출처

- [토스증권 Server Developer (Market Platform)](https://inthiswork.com/archives/323617)
- [토스증권 Server Developer (5년 이상) — wanted](https://www.wanted.co.kr/wd/204287)
- [토스증권 Server Developer (Platform) — LinkedIn](https://kr.linkedin.com/jobs/view/server-developer-platform-at-%ED%86%A0%EC%8A%A4%EC%A6%9D%EA%B6%8C-toss-securities-3531706700)
- [토스 Server Developer (3년 이상)](https://toss.im/career/job-detail?job_id=5028079003)
- [토스 서버 챕터 FAQ](https://toss.im/tossfeed/article/toss-serverchapter-faq10)
- [넥스트증권 Backend Engineer (Trading Product)](https://nextsecurities.career.greetinghr.com/o/209601)
- [넥스트증권 Backend Engineer (Service Platform)](https://nextsecurities.career.greetinghr.com/o/223644)
- [두나무 Backend Engineer — Greenhouse](https://job-boards.greenhouse.io/dunamu/jobs/5734779004)
- [카카오페이증권 — 리멤버](https://career.rememberapp.co.kr/job/posting/287383)
- [카카오페이증권 — 리멤버 (2)](https://career.rememberapp.co.kr/job/posting/278949)
