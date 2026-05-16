public class Order {
    // TODO: 주문 입력 및 금액 계산 기능 구현 예정
    private String[] orderedMenus = new String[10];
    private int[] orderedPrices = new int[10];

    private int orderCount = 0;
    private int totalPrice = 0;

public void addOrder(String menuName, int menuPrice) {

    if (orderCount >= orderedMenus.length) {
        System.out.println("더 이상 주문할 수 없습니다.");
        return;
    }

    orderedMenus[orderCount] = menuName;
    orderedPrices[orderCount] = menuPrice;

    totalPrice += menuPrice;
    orderCount++;

    System.out.println(menuName + " 주문이 추가되었습니다.");
    }
    // 주문 내역 출력 기능
public void showOrderList() {

    if (orderCount == 0) {
        System.out.println("주문 내역이 없습니다.");
        return;
    }

    System.out.println("===== 주문 내역 =====");

    for (int i = 0; i < orderCount; i++) {
        System.out.printf("%d. %-10s %,6d원\n",
                i + 1,
                orderedMenus[i],
                orderedPrices[i]);
    }

    System.out.println("====================");
    System.out.printf("총 금액: %,d원\n", totalPrice);
    }
    // 주문 초기화 기능
public void clearOrder() {

    orderedMenus = new String[10];
    orderedPrices = new int[10];

    orderCount = 0;
    totalPrice = 0;

    System.out.println("주문 내역이 초기화되었습니다.");
    }
}