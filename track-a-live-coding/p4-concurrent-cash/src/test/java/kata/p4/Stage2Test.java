package kata.p4;

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
@DisplayName("stage-2 동시 주문")
class Stage2Test {

    @Test
    @DisplayName("동시에 주문해도 예수금을 초과해 주문되지 않는다")
    void concurrentOrdersNeverOverdraw() {
        // 예시: 500,000원, 100스레드 × 10,000 → 정확히 50건 성공
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("성공한 주문 금액 합 + 남은 예수금 = 입금 총액이다")
    void moneyIsConserved() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("같은 주문ID로 동시에 요청해도 한 번만 차감한다")
    void duplicateOrderIdDeductsOnce() {
        // 예시: 10스레드 × 같은 O1 30,000 → 70,000
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("같은 주문ID의 재요청은 첫 요청과 같은 결과를 돌려준다")
    void duplicateOrderIdReturnsSameResult() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("서로 다른 계좌의 주문은 서로를 기다리지 않는다")
    void differentAccountsDoNotBlockEachOther() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("입금과 주문이 동시에 섞여도 금액이 맞다")
    void concurrentDepositsAndOrders() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
