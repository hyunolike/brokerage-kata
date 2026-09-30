package kata.p2;

/**
 * 호가창 한 단계의 조회 결과.
 *
 * @param price        가격
 * @param totalQuantity 해당 가격의 총 잔량
 * @param orderCount   해당 가격의 주문 건수
 */
public record PriceLevel(long price, long totalQuantity, int orderCount) {
}
