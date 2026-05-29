public class InputCheck {
    // TODO: 잘못된 입력 처리 기능 구현 예정
    public boolean isValidMenu(int menuNumber, int menuCount) {

    if (menuNumber < 1 || menuNumber > menuCount) {
        System.out.println("잘못된 메뉴 번호입니다. 1번부터" + menuCount + "번 사이의 번호를 입력해주세요.");
        return false;
    }

    return true;
    }
}