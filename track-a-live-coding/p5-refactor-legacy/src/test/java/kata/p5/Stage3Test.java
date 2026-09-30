package kata.p5;

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
@DisplayName("stage-3 신규 수수료 정책 추가")
class Stage3Test {

    @Test
    @DisplayName("쿠폰이 있으면 해외 수수료율은 0.07% 다")
    void overseasCouponRate() {
        // 예시: 200.00 × 10 → 1.40
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("임직원은 쿠폰이 있어도 기존 요율을 유지한다")
    void couponNotAppliedToEmployee() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("지점 채널에는 쿠폰이 적용되지 않는다")
    void couponNotAppliedToBranch() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("국내 API 주문 금액이 1억 원 이상이면 0.008% 가 적용된다")
    void apiBulkOrderDiscount() {
        // 예시: 100,000 × 1,000 → 8,000
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("VIP 는 대량 주문 요율에 50% 할인이 추가된다")
    void apiBulkOrderVipDiscount() {
        // 예시: → 4,000
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("1억 원 미만 API 주문은 기존 요율을 유지한다")
    void apiBelowThresholdUnchanged() {
        // 예시: 99,900 × 1,000 → 9,990
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("기존 호출부(OrderSettlement)의 결과는 변하지 않는다")
    void legacyCallerUnchanged() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
