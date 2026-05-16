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
}