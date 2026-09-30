package kata.p3;

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
@DisplayName("stage-2 실현 손익과 평가 손익")
class Stage2Test {

    @Test
    @DisplayName("매도 시 실현 손익은 매도 금액 - 매도분 원가다")
    void realizedPnlOnSell() {
        // 예시: SELL 6 @75,000 → +24,000
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("실현 손익은 종목별, 전체로 누적된다")
    void realizedPnlAccumulates() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("손실 매도는 음수 실현 손익이 된다")
    void negativeRealizedPnl() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("평가 손익은 현재가 × 보유 수량 - 총매입원가다")
    void unrealizedPnl() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("수익률은 소수 둘째 자리 HALF_UP 이다")
    void returnRateRoundedToTwoDecimals() {
        // 예시: 30,000 / 784,000 → 3.83%
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("보유 수량이 0이면 평가 금액, 평가 손익, 수익률이 모두 0이다")
    void zeroHoldingValuationIsZero() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("현재가가 없는 보유 종목이 있으면 실패한다")
    void missingCurrentPriceFails() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
