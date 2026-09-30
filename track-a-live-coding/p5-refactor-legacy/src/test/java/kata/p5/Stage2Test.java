package kata.p5;

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
@DisplayName("stage-2 동작을 유지하며 리팩터링")
class Stage2Test {

    @Test
    @DisplayName("Stage1Test 는 수정 없이 그대로 통과한다 (이 테스트는 확인용 메모 — 확인 후 지워도 된다)")
    void stage1TestsStillPass() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("이벤트 판정은 주입한 시간을 기준으로 한다")
    void eventUsesInjectedClock() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }

    @Test
    @DisplayName("분리한 정책(구조)을 단위 테스트한다")
    void policyUnitTest() {
        // given

        // when

        // then
        fail("TODO: 테스트를 작성하세요");
    }
}
