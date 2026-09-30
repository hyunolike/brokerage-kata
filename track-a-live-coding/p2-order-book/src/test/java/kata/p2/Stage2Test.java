package kata.p2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * stages/stage-2.md 의 테스트 골격.
 *
 * <p>1. 아래 {@code @Disabled} 줄을 지워 잠금을 푼다.
 * <br>2. 각 테스트의 given / when / then 을 직접 채운다. ({@code fail(...)} 은 지운다)
 * <br>3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
@Disabled("🔒 stage-2: stages/stage-2.md 를 읽은 뒤 이 줄을 지우고 시작")
@DisplayName("stage-2 가격 우선 · 시간 우선 매칭")
class Stage2Test {

    @Test
    @DisplayName("매수 주문은 가장 싼 매도 호가와 체결된다")
    void buyMatchesLowestAsk() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("매도 주문은 가장 비싼 매수 호가와 체결된다")
    void sellMatchesHighestBid() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("같은 가격이면 먼저 등록된 주문과 체결된다")
    void timePriorityWithinSamePrice() {
        // 예시: S2, S3 모두 70,200 → S2
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("체결 가격은 호가창에 먼저 있던 주문의 가격이다")
    void executionPriceIsRestingOrderPrice() {
        // 예시: SELL 69,900 vs BUY 70,100 → 70,100
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("교차하지 않는 주문은 호가창에 등록된다")
    void nonCrossingOrderRests() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("체결된 상대 주문은 호가창에서 사라진다")
    void filledRestingOrderIsRemoved() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
