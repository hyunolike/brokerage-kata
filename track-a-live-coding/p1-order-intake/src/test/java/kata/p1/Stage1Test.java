package kata.p1;

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
@DisplayName("stage-1 주문 접수와 검증")
class Stage1Test {

    @Test
    @DisplayName("유효한 주문을 접수하면 주문번호가 발급되고 상태는 RECEIVED 다")
    void placeValidOrder() {
        // 예시: 005930 BUY 10주 @71,000 → 주문번호 1
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("주문번호는 1부터 1씩 증가한다")
    void orderIdIncreases() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("발급된 주문번호로 주문을 조회할 수 있다")
    void findPlacedOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("종목코드가 6자리 숫자가 아니면 실패한다")
    void rejectInvalidSymbol() {
        // 예시: "5930", "00593A"
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("수량이 1 미만이면 실패한다")
    void rejectNonPositiveQuantity() {
        // 예시: 0, -1
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("가격이 호가 단위의 배수가 아니면 실패한다")
    void rejectPriceNotOnTick() {
        // 예시: 71,050 / 2,003
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("호가 단위 구간 경계값을 올바르게 판단한다")
    void tickSizeBoundaries() {
        // 예시: 1,999 / 2,000 / 4,995 / 5,000 / 500,000
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("주문 금액이 정확히 10억 원이면 성공한다")
    void acceptExactlyOrderLimit() {
        // 예시: 20,000주 @50,000
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("주문 금액이 10억 원을 넘으면 실패한다")
    void rejectOverOrderLimit() {
        // 예시: 20,001주 @50,000
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("실패한 주문은 주문번호를 소비하지 않는다")
    void failureDoesNotConsumeOrderId() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("실패 시 어떤 규칙을 위반했는지 구분할 수 있다")
    void failureTellsWhichRuleViolated() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
