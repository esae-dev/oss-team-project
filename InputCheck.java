public class InputCheck {
    public boolean isValidMenu(int menuNumber, int menuCount) {
        if (menuNumber < 1 || menuNumber > menuCount) {
            System.out.println("잘못된 메뉴 번호입니다. 1번부터 " + menuCount + "번 사이의 번호를 입력해주세요.");
            return false;
        }

        return true;
    }

    public boolean isValidQuantity(int quantity) {
        if (quantity < 1) {
            System.out.println("수량은 1개 이상 입력해야 합니다.");
            return false;
        }

        return true;
    }
}