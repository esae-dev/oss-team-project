public class OrderItem {
    private final String menuName;
    private final int menuPrice;
    private final int quantity;

    public OrderItem(String menuName, int menuPrice, int quantity) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.quantity = quantity;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return menuPrice * quantity;
    }
}