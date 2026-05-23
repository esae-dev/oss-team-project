public class Menu {

    private String[] menuNames = {
            "아메리카노",
            "카페라떼",
            "카푸치노",
            "치즈버거",
            "감자튀김"
    };

    private int[] menuPrices = {
            2000,
            3000,
            3500,
            5500,
            2500
    };
    //메뉴 카테고리 조회 기능 추가
    private Category[] menuCategories = {
        Category.DRINK,
        Category.DRINK,
        Category.DRINK,
        Category.FOOD,
        Category.FOOD
};
    // 메뉴판 출력(사용자에게 보여줄 때는 1번부터 출력함)
    public void printMenu() {

        System.out.println("===== 메뉴판 =====");

        for(int i = 0; i < menuNames.length; i++) {
            System.out.println((i + 1) + ". " + menuNames[i] + " - "  + menuPrices[i]  + "원");
        }
    }

    // 메뉴 이름 반환
    public String getMenuName(int index) {
        return menuNames[index];
    }

    // 메뉴 가격 반환
    public int getMenuPrice(int index) {
        return menuPrices[index];
    }

    // 메뉴 개수 반환
    public int getMenuCount() {
        return menuNames.length;
    }
    // 메뉴 카테고리 반환
    public Category getMenuCategory(int index) {
        return menuCategories[index];
    }
    // 음료 메뉴인지 확인
    public boolean isDrink(int index) {
        return menuCategories[index] == Category.DRINK;
    }
}