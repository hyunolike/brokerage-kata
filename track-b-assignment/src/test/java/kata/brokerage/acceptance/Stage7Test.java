package kata.brokerage.acceptance;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * specs/007-event-kafka/spec.md 의 테스트 골격.
 *
 * <p>1. 아래 {@code @Disabled} 줄을 지워 잠금을 푼다.
 * <br>2. 각 테스트의 given / when / then 을 직접 채운다. ({@code fail(...)} 은 지운다)
 * <br>3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
@Disabled("🔒 stage-7: specs/007-event-kafka/spec.md 를 읽은 뒤 이 줄을 지우고 시작")
@DisplayName("stage-7 주문 이벤트 발행과 소비 (Kafka)")
class Stage7Test {

    @Test
    @DisplayName("AC-007-1 주문 접수가 커밋되면 이벤트가 1건 발행된다")
    void publishOnCommit() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-007-2 트랜잭션이 롤백되면 이벤트가 발행되지 않는다")
    void noPublishOnRollback() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-007-3 브로커 불가 중에도 주문은 성공하고 복구 후 이벤트가 발행된다")
    void publishAfterBrokerRecovery() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-007-4 같은 이벤트를 두 번 소비해도 주문 이력은 1건만 늘어난다")
    void idempotentConsumer() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-007-5 같은 주문의 이벤트는 발생 순서대로 이력에 반영된다")
    void orderedPerOrder() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-007-6 처리 불가능한 메시지는 재시도 후 DLT 로 이동하고 다음 메시지 처리는 계속된다")
    void deadLetterAfterRetries() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
