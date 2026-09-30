package kata.p1;

/**
 * 주문 접수 창구. stage-1 시작 코드.
 *
 * <p>시그니처(파라미터 타입, 반환 타입, 예외)는 자유롭게 바꿔도 된다.
 */
public class OrderService {

    /**
     * 주문을 접수하고 주문번호를 반환한다.
     *
     * @param symbol   종목코드 (예: "005930")
     * @param side     매매구분 ("BUY" / "SELL")
     * @param quantity 수량
     * @param price    가격(원)
     */
    public long place(String symbol, String side, long quantity, long price) {
        throw new UnsupportedOperationException("TODO: stage-1");
    }

    /** 주문번호로 주문을 조회한다. */
    public Order find(long orderId) {
        throw new UnsupportedOperationException("TODO: stage-1");
    }
}
