package kata.p2;

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
@DisplayName("stage-3 부분 체결과 잔량 처리")
class Stage3Test {

    @Test
    @DisplayName("새 주문은 여러 주문과 여러 가격 레벨에 걸쳐 체결된다")
    void sweepMultipleOrdersAndLevels() {
        // 예시: BUY 70,300 × 12 → S1 3, S2 4, S3 5
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("체결 결과는 체결된 순서대로 반환된다")
    void tradesReturnedInExecutionOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("일부 체결된 상대 주문은 잔량이 남고 시간 순서를 유지한다")
    void partiallyFilledRestingOrderKeepsTimePriority() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("교차가 끝나고 남은 잔량은 호가창에 등록된다")
    void remainingQuantityRests() {
        // 예시: BUY 70,400 × 8 → 5 체결, 3 등록
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("잔량이 0이 된 가격 레벨은 호가창에서 제거된다")
    void emptyLevelIsRemoved() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
