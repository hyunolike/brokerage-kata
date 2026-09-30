package kata.p3;

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
@DisplayName("stage-4 해외주식과 환율")
class Stage4Test {

    @Test
    @DisplayName("해외 수수료는 0.25% 를 센트 단위 HALF_UP 한다")
    void usdFeeRoundedToCent() {
        // 예시: 2,000.00 → 5.00, 840.00 → 2.10
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("USD 원가와 원화 원가를 각각 관리한다")
    void costTrackedInBothCurrencies() {
        // 예시: 2,005.00 / 2,706,750
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("해외 종목 평균 단가는 USD 로 조회한다")
    void averagePriceInUsd() {
        // 예시: 200.50
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("원화 실현 손익은 매도 시점 환율로 계산한다")
    void krwRealizedPnlUsesSellRate() {
        // 예시: +90,360
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("원화 평가 손익은 현재 환율로 계산한다")
    void krwUnrealizedPnlUsesCurrentRate() {
        // 예시: +156,150
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("국내 주식 계산 규칙은 그대로 유지된다")
    void domesticRulesUnchanged() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("포트폴리오 전체 손익은 국내와 해외를 원화로 합산한다")
    void totalPnlSumsInKrw() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
