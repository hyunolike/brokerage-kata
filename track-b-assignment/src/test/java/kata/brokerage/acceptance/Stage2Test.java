package kata.brokerage.acceptance;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * specs/002-order/spec.md 의 테스트 골격.
 *
 * <p>1. 아래 {@code @Disabled} 줄을 지워 잠금을 푼다.
 * <br>2. 각 테스트의 given / when / then 을 직접 채운다. ({@code fail(...)} 은 지운다)
 * <br>3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
@Disabled("🔒 stage-2: specs/002-order/spec.md 를 읽은 뒤 이 줄을 지우고 시작")
@DisplayName("stage-2 주문 생성 / 취소 / 조회")
class Stage2Test {

    @Test
    @DisplayName("AC-002-1 매수 주문 시 주문 금액이 묶인 금액으로 옮겨간다")
    void placeBuyOrderHoldsCash() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-002-2 주문 가능 금액이 부족하면 실패하고 잔고는 그대로다")
    void rejectInsufficientCash() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-002-3 호가 단위를 어기면 실패한다")
    void rejectInvalidTickSize() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-002-4 접수 주문을 취소하면 묶인 금액이 돌아온다")
    void cancelRestoresCash() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-002-5 취소 또는 체결된 주문은 취소할 수 없다")
    void rejectCancelOnClosedOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-002-6 체결하면 예수금 총액이 주문 금액만큼 줄어든다")
    void fillConsumesHold() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-002-7 상태 필터로 주문 목록을 최신순 조회한다")
    void listOrdersByStatus() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-002-8 다른 계좌의 주문은 조회/취소할 수 없다")
    void rejectOtherAccountsOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
