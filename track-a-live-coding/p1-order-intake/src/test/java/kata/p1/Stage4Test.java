package kata.p1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * stages/stage-4.md 의 테스트 골격.
 *
 * <p>1. 아래 {@code @Disabled} 줄을 지워 잠금을 푼다.
 * <br>2. 각 테스트의 given / when / then 을 직접 채운다. ({@code fail(...)} 은 지운다)
 * <br>3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
@Disabled("🔒 stage-4: stages/stage-4.md 를 읽은 뒤 이 줄을 지우고 시작")
@DisplayName("stage-4 정정 / 취소")
class Stage4Test {

    @Test
    @DisplayName("접수 상태의 주문을 취소하면 CANCELED 가 된다")
    void cancelReceivedOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("부분 체결 주문을 취소해도 체결 수량과 평균 체결가는 유지된다")
    void cancelPartiallyFilledOrderKeepsFills() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("지정가 주문의 가격을 정정할 수 있다")
    void amendPrice() {
        // 예시: 71,000 → 71,500
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("가격 정정 시 호가 단위와 주문 한도를 다시 검증한다")
    void amendPriceRevalidatesTickAndLimit() {
        // 예시: 71,550 실패
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("수량 정정은 미체결 잔량을 줄이는 방향으로만 가능하다")
    void amendQuantityOnlyDecreases() {
        // 예시: 잔량 7 → 5 성공, 7 → 8 실패
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("잔량을 0으로 만드는 정정은 거부한다")
    void rejectAmendQuantityToZero() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("시장가 주문은 정정할 수 없다")
    void rejectAmendMarketOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("FILLED 또는 CANCELED 주문은 정정/취소할 수 없다")
    void rejectOnClosedOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("존재하지 않는 주문번호는 실패한다")
    void rejectUnknownOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("정정 후에도 주문번호는 유지된다")
    void orderIdUnchangedAfterAmend() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
