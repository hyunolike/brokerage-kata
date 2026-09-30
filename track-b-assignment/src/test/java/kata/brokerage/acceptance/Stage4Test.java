package kata.brokerage.acceptance;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * specs/004-error-response/spec.md 의 테스트 골격.
 *
 * <p>1. 아래 {@code @Disabled} 줄을 지워 잠금을 푼다.
 * <br>2. 각 테스트의 given / when / then 을 직접 채운다. ({@code fail(...)} 은 지운다)
 * <br>3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
@Disabled("🔒 stage-4: specs/004-error-response/spec.md 를 읽은 뒤 이 줄을 지우고 시작")
@DisplayName("stage-4 예외 처리와 공통 응답")
class Stage4Test {

    @Test
    @DisplayName("AC-004-1 검증 실패 시 모든 필드 오류가 응답에 담긴다")
    void validationErrorsListAllFields() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-004-2 없는 계좌는 404 와 구분 가능한 에러 코드를 준다")
    void notFoundHasErrorCode() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-004-3 잔고 부족은 도메인 에러 코드로 구분된다")
    void domainErrorHasErrorCode() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-004-4 내부 예외는 500 이고 스택 트레이스를 노출하지 않는다")
    void internalErrorHidesDetails() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-004-5 잘못된 JSON 은 400 공통 포맷으로 응답한다")
    void malformedJson() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
