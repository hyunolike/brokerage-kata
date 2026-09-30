package kata.p5.legacy;

/**
 * 주문 정산 (정산팀 소유 코드 - 수정 금지)
 */
public class OrderSettlement {

    private final FeeService feeService = new FeeService();

    public String settle(String market, String grade, String channel, String side,
                         double price, int quantity, String joinDate, boolean event) {
        double fee = feeService.calc(market, grade, channel, side, price, quantity, joinDate, event);
        if (fee < 0) {
            return "ERROR";
        }
        return market + "|" + side + "|" + (price * quantity) + "|" + FeeService.lastFee;
    }
}
