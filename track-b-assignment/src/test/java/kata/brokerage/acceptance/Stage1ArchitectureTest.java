package kata.brokerage.acceptance;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * 아키텍처 규칙 테스트 골격. docs/adr/0000-architecture.md 에서 결정한 규칙을 여기에 옮긴다.
 *
 * <p>1. ADR-0000 을 먼저 작성하고, 아래 {@code @Disabled} 줄을 지운다.
 * <br>2. 고른 구조에 맞게 규칙을 채운다. 해당 없는 시나리오는 지우고, 필요한 규칙은 추가한다.
 * <br>3. ArchUnit 사용법: {@code new ClassFileImporter().importPackages("kata.brokerage")} 로 클래스를 읽고
 * {@code ArchRule.check(classes)} 로 검증한다. (또는 {@code @AnalyzeClasses} + {@code @ArchTest})
 * <br>4. 참고: /docs/guides/architecture.md
 */
@Disabled("🔒 stage-1: docs/adr/0000-architecture.md 를 작성한 뒤 이 줄을 지우고 시작")
@DisplayName("stage-1 아키텍처 규칙 (ADR-0000)")
class Stage1ArchitectureTest {

    @Test
    @DisplayName("ADR-0000 에서 정한 레이어(또는 모듈) 간 의존 방향을 지킨다")
    void dependencyDirection() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("기능(패키지) 간 순환 의존이 없다")
    void noCycles() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("도메인 규칙이 있는 곳은 ADR-0000 에서 정한 프레임워크 의존 제한을 지킨다")
    void domainFrameworkIndependence() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("웹 계층은 JPA 엔티티를 요청/응답으로 직접 노출하지 않는다")
    void noEntityInWebLayer() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
