public class Order {
    private OrderItem[] orderItems = new OrderItem[10];

    private int orderCount = 0;
    private int totalPrice = 0;

    // 기존 코드 호환용: 수량을 입력하지 않으면 기본 1개 주문
    public void addOrder(String menuName, int menuPrice) {
        addOrder(menuName, menuPrice, 1);
    }

    // 수량 기능이 추가된 주문 메서드
    public void addOrder(String menuName, int menuPrice, int quantity) {
        if (orderCount >= orderItems.length) {
            System.out.println("더 이상 주문할 수 없습니다.");
            return;
        }

        OrderItem orderItem = new OrderItem(menuName, menuPrice, quantity);
        orderItems[orderCount] = orderItem;

        totalPrice += orderItem.getTotalPrice();
        orderCount++;

        System.out.println(menuName + " " + quantity + "개 주문이 추가되었습니다.");
    }

    public void clearOrder() {
        orderItems = new OrderItem[10];

        orderCount = 0;
        totalPrice = 0;

        System.out.println("주문 내역이 초기화되었습니다.");
    }

    public int getOrderCount() {
        return orderCount;
    }

    public OrderItem getOrderItem(int index) {
        return orderItems[index];
    }

    public String getOrderedMenu(int index) {
        return orderItems[index].getMenuName();
    }

    public int getOrderedPrice(int index) {
        return orderItems[index].getMenuPrice();
    }

    public int getOrderedQuantity(int index) {
        return orderItems[index].getQuantity();
    }

    public int getOrderedTotalPrice(int index) {
        return orderItems[index].getTotalPrice();
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}