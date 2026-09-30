package kata.p4;

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
@DisplayName("stage-1 예수금 차감")
class Stage1Test {

    @Test
    @DisplayName("입금하면 예수금이 늘어난다")
    void deposit() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("1원 미만 입금은 실패한다")
    void rejectNonPositiveDeposit() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("주문하면 주문 금액만큼 예수금이 차감된다")
    void orderDeductsCash() {
        // 예시: 100,000 - 30,000 → 70,000
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("예수금이 부족하면 주문이 거부되고 예수금은 변하지 않는다")
    void rejectOrderOverAvailableCash() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("예수금과 같은 금액의 주문은 성공한다")
    void orderExactlyAvailableCash() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("존재하지 않는 계좌에 대한 요청은 실패한다")
    void unknownAccountFails() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
