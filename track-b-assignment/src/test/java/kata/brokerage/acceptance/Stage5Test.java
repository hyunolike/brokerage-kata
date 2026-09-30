package kata.brokerage.acceptance;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * specs/005-integration-test/spec.md 의 테스트 골격.
 *
 * <p>1. 아래 {@code @Disabled} 줄을 지워 잠금을 푼다.
 * <br>2. 각 테스트의 given / when / then 을 직접 채운다. ({@code fail(...)} 은 지운다)
 * <br>3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
@Disabled("🔒 stage-5: specs/005-integration-test/spec.md 를 읽은 뒤 이 줄을 지우고 시작")
@DisplayName("stage-5 통합 테스트")
class Stage5Test {

    @Test
    @DisplayName("계좌 개설 → 입금 → 주문 → 취소 → 조회 전체 시나리오가 성공한다")
    void endToEndScenario() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("테스트 실행 순서와 무관하게 결과가 같다 (격리 전략 확인)")
    void testsAreIsolated() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
