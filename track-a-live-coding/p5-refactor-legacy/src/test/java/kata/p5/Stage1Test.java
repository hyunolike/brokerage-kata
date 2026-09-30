package kata.p5;

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
@DisplayName("stage-1 현재 동작을 고정하는 테스트")
class Stage1Test {

    @Test
    @DisplayName("국내 NORMAL 등급의 채널별 매수 수수료를 고정한다")
    void domesticNormalByChannel() {
        // 예시: MTS, HTS, API, BRANCH
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("국내 매도는 거래세가 더해진다")
    void domesticSellAddsTransactionTax() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("지점 채널은 최소 수수료가 적용된다")
    void branchMinimumFee() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("국내 VIP 등급의 수수료를 고정한다 (반올림 방식 주의)")
    void domesticVipDiscount() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("임직원 등급의 수수료를 고정한다 (국내 매도 포함)")
    void employeeFee() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("해외 주문의 등급별 수수료를 고정한다 (반올림/버림 방식 주의)")
    void overseasFeeByGrade() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("신규가입 이벤트의 가입 경과일 경계 동작을 고정한다 (NORMAL vs VIP 비교)")
    void newMemberEventBoundary() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("잘못된 입력의 반환값 또는 예외를 고정한다")
    void invalidInputs() {
        // 예시: qty 0, 알 수 없는 시장/등급, null
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("lastFee 전역 상태의 동작을 고정한다")
    void lastFeeGlobalState() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("OrderSettlement 의 출력 형식을 고정한다")
    void settlementOutputFormat() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
