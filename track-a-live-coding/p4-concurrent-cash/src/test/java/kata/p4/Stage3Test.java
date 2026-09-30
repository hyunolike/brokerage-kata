package kata.p4;

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
@DisplayName("stage-3 체결과 취소, 금액 복원")
class Stage3Test {

    @Test
    @DisplayName("주문 금액은 묶인 금액으로 잡힌다")
    void orderHoldsAmount() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("체결되면 묶인 금액에서 체결 금액만큼 확정 차감된다")
    void fillConsumesHold() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("취소하면 미체결 묶인 금액이 예수금으로 복원된다")
    void cancelRestoresUnfilledHold() {
        // 예시: 60,000 주문, 20,000 체결 후 취소 → 40,000 복원
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("이미 취소된 주문을 다시 취소해도 변화가 없다")
    void cancelIsIdempotent() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("전량 체결된 주문은 취소할 수 없다")
    void rejectCancelOnFullyFilledOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("취소된 주문에는 체결을 반영할 수 없다")
    void rejectFillOnCanceledOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("누적 체결 금액은 주문 금액을 넘을 수 없다")
    void rejectOverFill() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("같은 주문에 취소가 동시에 여러 번 들어와도 한 번만 복원한다")
    void concurrentCancelsRestoreOnce() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("같은 주문에 체결과 취소가 동시에 들어와도 금액 합계가 맞다")
    void concurrentFillAndCancelKeepMoneyConsistent() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
