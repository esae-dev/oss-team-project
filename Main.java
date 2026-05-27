import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        Order order = new Order();
        InputCheck inputCheck = new InputCheck();
        Receipt receipt = new Receipt();
        Option option = new Option();

        System.out.println("Mini Kiosk Program");

        while (true) {
            menu.printMenu();

            System.out.print("메뉴 번호를 입력하세요 (0 입력 시 주문 종료): ");
            int menuNumber = scanner.nextInt();

            if (menuNumber == 0) {
                break;
            }

            if (!inputCheck.isValidMenu(menuNumber, menu.getMenuCount())) {
                continue;
            }

            int menuIndex = menuNumber - 1;

            String menuName = menu.getMenuName(menuIndex);
            int menuPrice = menu.getMenuPrice(menuIndex);

            if (menu.isDrink(menuIndex)) {
                option.printOptions();

                System.out.print("옵션 번호를 입력하세요: ");
                int optionNumber = scanner.nextInt();

                if (!option.isValidOption(optionNumber)) {
                    System.out.println("잘못된 옵션 번호입니다.");
                    continue;
                }

                String optionName = option.getOption(optionNumber);
                int optionPrice = option.getOptionPrice(optionNumber);

                menuName = menuName + "(" + optionName + ")";
                menuPrice += optionPrice;
            }

            System.out.print("수량을 입력하세요: ");
            int quantity = scanner.nextInt();

            if (!inputCheck.isValidQuantity(quantity)) {
                continue;
            }

            order.addOrder(menuName, menuPrice, quantity);
            System.out.println();
        }

        receipt.printReceipt(order);

        scanner.close();
    }
}