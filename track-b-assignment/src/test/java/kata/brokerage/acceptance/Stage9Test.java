package kata.brokerage.acceptance;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * specs/009-observability/spec.md 의 테스트 골격.
 *
 * <p>1. 아래 {@code @Disabled} 줄을 지워 잠금을 푼다.
 * <br>2. 각 테스트의 given / when / then 을 직접 채운다. ({@code fail(...)} 은 지운다)
 * <br>3. 시나리오는 최소 목록이다. 필요한 케이스는 자유롭게 추가한다.
 */
@Disabled("🔒 stage-9: specs/009-observability/spec.md 를 읽은 뒤 이 줄을 지우고 시작")
@DisplayName("stage-9 관측성")
class Stage9Test {

    @Test
    @DisplayName("AC-009-1 헬스 체크에 DB 와 Redis 상태가 포함된다")
    void healthIncludesDependencies() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-009-2 거부 사유별 주문 카운터가 증가한다")
    void rejectionCounterByReason() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-009-3 에러 응답의 추적 ID 로 서버 로그를 찾을 수 있다")
    void traceIdInErrorResponse() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("AC-009-4 락 대기 시간이 히스토그램(타이머)으로 노출된다")
    void lockWaitTimeMetric() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
