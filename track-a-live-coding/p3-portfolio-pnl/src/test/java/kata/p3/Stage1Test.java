package kata.p3;

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
@DisplayName("stage-1 보유 수량과 평균 단가")
class Stage1Test {

    @Test
    @DisplayName("매수하면 보유 수량과 총매입원가가 늘어난다")
    void buyIncreasesQuantityAndCost() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("여러 번 매수하면 평균 단가는 총매입원가 / 보유 수량이다")
    void averagePriceAfterMultipleBuys() {
        // 예시: 10@70,000 + 5@73,000 → 71,000.00
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("매도해도 평균 단가는 변하지 않는다")
    void sellKeepsAveragePrice() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("매도분 원가는 원 미만을 HALF_UP 으로 반올림한다")
    void sellCostIsRoundedHalfUp() {
        // 예시: 784,000 × 3 / 11 → 213,818
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("평균 단가는 소수 둘째 자리 HALF_UP 이다")
    void averagePriceRoundedToTwoDecimals() {
        // 예시: 784,000 / 11 → 71,272.73
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("전량 매도하면 보유 수량과 총매입원가가 모두 0이 된다")
    void sellAllClearsCost() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("보유 수량이 0이면 평균 단가는 0이다")
    void zeroQuantityAveragePriceIsZero() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("보유 수량보다 많이 매도하면 거부되고 상태가 변하지 않는다")
    void rejectOverSell() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("종목별 잔고는 서로 영향을 주지 않는다")
    void symbolsAreIndependent() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
