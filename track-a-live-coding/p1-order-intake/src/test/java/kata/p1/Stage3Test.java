package kata.p1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * stages/stage-3.md 의 테스트 골격.
 *
 * <p>1. 아래 {@code @Disabled} 줄을 지워 잠금을 푼다.
 * <br>2. 각 테스트의 given / when / then 을 직접 채운다. ({@code fail(...)} 은 지운다)
 * <br>3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
@Disabled("🔒 stage-3: stages/stage-3.md 를 읽은 뒤 이 줄을 지우고 시작")
@DisplayName("stage-3 부분 체결")
class Stage3Test {

    @Test
    @DisplayName("일부 체결되면 PARTIALLY_FILLED 가 되고 잔량이 줄어든다")
    void partialFill() {
        // 예시: 10주 주문에 3주 체결 → 잔량 7
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("누적 체결 수량이 주문 수량과 같아지면 FILLED 가 된다")
    void fullFill() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("평균 체결가는 원 단위 미만을 버린다")
    void averageFilledPriceIsFloored() {
        // 예시: 3주@71,000 + 4주@70,900 → 70,942
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("잔량을 초과하는 체결은 거부되고 상태가 변하지 않는다")
    void rejectOverFill() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("FILLED 주문에는 체결을 반영할 수 없다")
    void rejectFillOnFilledOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("지정가 매수는 주문가보다 비싸게 체결될 수 없다")
    void rejectBuyFillAboveLimitPrice() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("지정가 매도는 주문가보다 싸게 체결될 수 없다")
    void rejectSellFillBelowLimitPrice() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("시장가 주문은 체결 가격 제한이 없다")
    void marketOrderHasNoPriceLimitOnFill() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("체결 수량이 1 미만이면 거부한다")
    void rejectNonPositiveFillQuantity() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
