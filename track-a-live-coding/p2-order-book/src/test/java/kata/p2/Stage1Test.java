package kata.p2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * stages/stage-1.md 의 테스트 골격.
 *
 * <p>1. 아래 {@code @Disabled} 줄을 지워 잠금을 푼다.
 * <br>2. 각 테스트의 given / when / then 을 직접 채운다. ({@code fail(...)} 은 지운다)
 * <br>3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
@Disabled("🔒 stage-1: stages/stage-1.md 를 읽은 뒤 이 줄을 지우고 시작")
@DisplayName("stage-1 호가 등록과 조회")
class Stage1Test {

    @Test
    @DisplayName("최우선 매수 호가는 가장 높은 매수 가격이다")
    void bestBidIsHighestBuyPrice() {
        // 예시: B1 70,000 / B2 70,100 → 70,100
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("최우선 매도 호가는 가장 낮은 매도 가격이다")
    void bestAskIsLowestSellPrice() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("빈 호가창은 최우선 호가가 없고 depth 조회 결과가 비어 있다")
    void emptyBook() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("같은 가격의 주문은 하나의 레벨로 합쳐 총 잔량과 건수를 보여준다")
    void aggregateSamePriceLevel() {
        // 예시: 70,000 × 10 + 70,000 × 7 → 17, 2건
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("매수 호가는 가격 내림차순으로 조회된다")
    void bidsSortedDescending() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("매도 호가는 가격 오름차순으로 조회된다")
    void asksSortedAscending() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("depth 보다 레벨이 많으면 depth 만큼만 반환한다")
    void depthLimitsLevels() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("이번 단계에서는 교차하는 호가도 체결하지 않고 쌓는다")
    void crossedOrdersAreNotMatchedYet() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("수량 또는 가격이 1 미만이거나 주문ID가 중복되면 실패한다")
    void rejectInvalidOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
