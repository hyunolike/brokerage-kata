package kata.brokerage.acceptance;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * specs/001-account/spec.md 의 테스트 골격.
 *
 * <p>1. 아래 {@code @Disabled} 줄을 지워 잠금을 푼다.
 * <br>2. 각 테스트의 given / when / then 을 직접 채운다. ({@code fail(...)} 은 지운다)
 * <br>3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
@Disabled("🔒 stage-1: specs/001-account/spec.md 를 읽은 뒤 이 줄을 지우고 시작")
@DisplayName("stage-1 계좌와 입금")
class Stage1Test {

    @Test
    @DisplayName("AC-001-1 계좌를 개설하면 식별자가 발급되고 잔고는 모두 0이다")
    void openAccount() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-001-2 이름이 비어 있거나 20자를 넘으면 검증 실패")
    void rejectInvalidOwnerName() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-001-3 입금하면 예수금 총액과 주문 가능 금액이 늘어난다")
    void deposit() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-001-4 0원 또는 1억 원 초과 입금은 검증 실패하고 잔고는 그대로다")
    void rejectInvalidDepositAmount() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-001-5 존재하지 않는 계좌는 계좌 없음으로 실패한다")
    void unknownAccount() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-001-6 입금 내역은 최신순으로 조회된다")
    void depositHistoryLatestFirst() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
