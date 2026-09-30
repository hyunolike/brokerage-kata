package kata.p3;

import java.math.BigDecimal;

/**
 * 체결 내역을 반영해 잔고와 손익을 계산한다. stage-1 시작 코드.
 *
 * <p>시그니처는 자유롭게 바꿔도 된다.
 */
public class Portfolio {

    /** 체결 1건을 반영한다. */
    public void apply(Trade trade) {
        throw new UnsupportedOperationException("TODO: stage-1");
    }

    /** 종목의 보유 수량. */
    public long quantityOf(String symbol) {
        throw new UnsupportedOperationException("TODO: stage-1");
    }

    /** 종목의 평균 단가. */
    public BigDecimal averagePriceOf(String symbol) {
        throw new UnsupportedOperationException("TODO: stage-1");
    }
}
