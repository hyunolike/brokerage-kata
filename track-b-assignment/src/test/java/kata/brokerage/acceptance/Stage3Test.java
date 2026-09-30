package kata.brokerage.acceptance;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * specs/003-concurrency/spec.md 의 테스트 골격.
 *
 * <p>1. 아래 {@code @Disabled} 줄을 지워 잠금을 푼다.
 * <br>2. 각 테스트의 given / when / then 을 직접 채운다. ({@code fail(...)} 은 지운다)
 * <br>3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
@Disabled("🔒 stage-3: specs/003-concurrency/spec.md 를 읽은 뒤 이 줄을 지우고 시작")
@DisplayName("stage-3 주문 동시성")
class Stage3Test {

    @Test
    @DisplayName("AC-003-1 동시 주문 100건 중 정확히 50건만 접수된다")
    void concurrentOrdersNeverOverdraw() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-003-2 같은 멱등 키의 동시 요청은 주문 1건만 만든다")
    void idempotentOrderCreation() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-003-3 같은 주문의 동시 취소는 한 번만 복원한다")
    void concurrentCancelsRestoreOnce() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-003-4 입금과 주문이 동시에 섞여도 잔고 불변식이 유지된다")
    void invariantsHoldUnderMixedLoad() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
