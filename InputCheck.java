public class InputCheck {
    // TODO: 잘못된 입력 처리 기능 구현 예정
    public boolean isValidMenu(int menuNumber, int menuCount) {

    if (menuNumber < 1 || menuNumber > menuCount) {
        System.out.println("잘못된 메뉴 번호입니다.");
        return false;
    }

    return true;
    }
}