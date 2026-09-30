package kata.p1;

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
@DisplayName("stage-2 지정가 / 시장가")
class Stage2Test {

    @Test
    @DisplayName("지정가 주문은 기존 검증 규칙을 그대로 따른다")
    void limitOrderKeepsStage1Rules() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("시장가 주문은 가격 없이 접수된다")
    void placeMarketOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("시장가 주문에 가격이 있으면 실패한다")
    void rejectMarketOrderWithPrice() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("지정가 주문에 가격이 없으면 실패한다")
    void rejectLimitOrderWithoutPrice() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("시장가 주문 한도는 상한가 × 수량으로 검증한다")
    void marketOrderLimitUsesUpperLimitPrice() {
        // 예시: 기준가 70,000 → 상한가 91,000, 10,989주 성공 / 10,990주 실패
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("상한가는 기준가 × 1.3 을 호가 단위로 내림한 값이다")
    void upperLimitPriceIsFlooredToTick() {
        // 예시: 기준가 43,210 → 56,100
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("기준가를 조회할 수 없는 종목의 시장가 주문은 실패한다")
    void unknownSymbolReferencePrice() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
