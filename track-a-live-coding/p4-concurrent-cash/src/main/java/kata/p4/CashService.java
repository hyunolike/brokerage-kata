package kata.p4;

/**
 * 계좌 예수금 관리. stage-1 시작 코드.
 *
 * <p>시그니처는 자유롭게 바꿔도 된다.
 */
public class CashService {

    public void openAccount(String accountId) {
        throw new UnsupportedOperationException("TODO: stage-1");
    }

    public void deposit(String accountId, long amount) {
        throw new UnsupportedOperationException("TODO: stage-1");
    }

    /** 주문 금액만큼 예수금을 차감한다. 예수금이 부족하면 거부한다. */
    public void placeOrder(String accountId, String orderId, long amount) {
        throw new UnsupportedOperationException("TODO: stage-1");
    }

    public long availableCash(String accountId) {
        throw new UnsupportedOperationException("TODO: stage-1");
    }
}
