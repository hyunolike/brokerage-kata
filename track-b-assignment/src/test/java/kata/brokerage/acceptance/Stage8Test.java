package kata.brokerage.acceptance;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * specs/008-realtime-push/spec.md 의 테스트 골격.
 *
 * <p>1. 아래 {@code @Disabled} 줄을 지워 잠금을 푼다.
 * <br>2. 각 테스트의 given / when / then 을 직접 채운다. ({@code fail(...)} 은 지운다)
 * <br>3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
@Disabled("🔒 stage-8: specs/008-realtime-push/spec.md 를 읽은 뒤 이 줄을 지우고 시작")
@DisplayName("stage-8 주문 상태 실시간 푸시")
class Stage8Test {

    @Test
    @DisplayName("AC-008-1 계좌에 연결된 클라이언트는 1초 이내에 주문 상태 변경을 받는다")
    void pushToOwnerWithinOneSecond() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-008-2 다른 계좌의 주문 변경은 전달되지 않는다")
    void noPushToOtherAccounts() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-008-3 재연결하면 끊긴 동안의 변경을 알 수 있다")
    void recoverMissedEventsOnReconnect() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
