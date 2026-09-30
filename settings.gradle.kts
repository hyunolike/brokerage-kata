rootProject.name = "brokerage-kata"

// 트랙 A: 라이브 코딩 (문제 하나 = 서브프로젝트 하나)
include(
    "track-a-live-coding:p1-order-intake",
    "track-a-live-coding:p2-order-book",
    "track-a-live-coding:p3-portfolio-pnl",
    "track-a-live-coding:p4-concurrent-cash",
    "track-a-live-coding:p5-refactor-legacy",
)

// 트랙 B: 과제 (Spring Boot)
include("track-b-assignment")

// 트랙 C(프론트엔드)는 Node 프로젝트라 Gradle에 포함하지 않는다. track-c-frontend/README.md 참고.
