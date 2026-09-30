package kata.p3;

/**
 * 체결 1건. stage-1 시작 코드.
 *
 * <p>타입과 필드는 자유롭게 바꿔도 된다. (예: side 를 enum 으로, price 를 금액 타입으로)
 */
public record Trade(String symbol, String side, long quantity, long price) {
}
