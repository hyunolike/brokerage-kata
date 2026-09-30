package kata.p3;

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
@DisplayName("stage-3 수수료와 세금")
class Stage3Test {

    @Test
    @DisplayName("매수 수수료는 원 미만 버림하고 취득 원가에 포함된다")
    void buyFeeIsFlooredAndAddedToCost() {
        // 예시: 365,000 → 54
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("매도 수수료와 거래세는 원 미만 버림한다")
    void sellFeeAndTaxAreFloored() {
        // 예시: 450,000 → 67, 810
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("실현 손익에서 매도 수수료와 거래세를 뺀다")
    void realizedPnlDeductsFeeAndTax() {
        // 예시: +23,059
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("평가 손익에는 미래 매도 비용을 반영하지 않는다")
    void unrealizedPnlIgnoresFutureCosts() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("종목별 누적 수수료와 세금을 조회할 수 있다")
    void accumulatedFeeAndTax() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
