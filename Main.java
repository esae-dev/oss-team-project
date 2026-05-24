import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        Order order = new Order();
        InputCheck inputCheck = new InputCheck();
        Receipt receipt = new Receipt();
        Option option = new Option(); // option 객체추가

        System.out.println("Mini Kiosk Program");

        while (true) {
            menu.printMenu();

            System.out.print("메뉴 번호를 입력하세요 (0 입력 시 주문 종료): ");
            int menuNumber = scanner.nextInt(); //일단 번호로만 입력받음(추후 업데이트 예정)

            if (menuNumber == 0) {
                break;
            }

            if (!inputCheck.isValidMenu(menuNumber, menu.getMenuCount())) {
                continue;
            }

            int menuIndex = menuNumber - 1;

            String menuName = menu.getMenuName(menuIndex);
            int menuPrice = menu.getMenuPrice(menuIndex);

            order.addOrder(menuName, menuPrice);
            System.out.println();
        }

        receipt.printReceipt(order);

        scanner.close();
    }
}