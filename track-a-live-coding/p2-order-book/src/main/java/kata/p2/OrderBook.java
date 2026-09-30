package kata.p2;

import java.util.List;
import java.util.OptionalLong;

/**
 * 한 종목의 호가창. stage-1 시작 코드.
 *
 * <p>시그니처는 자유롭게 바꿔도 된다. (stage-2부터는 체결 결과를 돌려줘야 한다)
 */
public class OrderBook {

    public void place(String orderId, Side side, long price, long quantity) {
        throw new UnsupportedOperationException("TODO: stage-1");
    }

    public OptionalLong bestBid() {
        throw new UnsupportedOperationException("TODO: stage-1");
    }

    public OptionalLong bestAsk() {
        throw new UnsupportedOperationException("TODO: stage-1");
    }

    public List<PriceLevel> bids(int depth) {
        throw new UnsupportedOperationException("TODO: stage-1");
    }

    public List<PriceLevel> asks(int depth) {
        throw new UnsupportedOperationException("TODO: stage-1");
    }
}
