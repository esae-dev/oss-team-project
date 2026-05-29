public class Receipt {
    public void printReceipt(Order order) {
        if (order.getOrderCount() == 0) {
            System.out.println("주문 내역이 없습니다.");
            return;
        }

        System.out.println("========== 영수증 ==========");

        for (int i = 0; i < order.getOrderCount(); i++) {
            System.out.printf("%d. %-10s %,6d원 x %d개 = %,6d원\n",
                    i + 1,
                    order.getOrderedMenu(i),
                    order.getOrderedPrice(i),
                    order.getOrderedQuantity(i),
                    order.getOrderedTotalPrice(i));
        }

        System.out.println("--------------------------");
        System.out.printf("총 금액 : %,d원\n", order.getTotalPrice());
        System.out.println("==========================");
    }
}