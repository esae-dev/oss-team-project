public class Menu {

    private MenuItem[] menuItems = {
            new MenuItem("아메리카노", 2000, Category.DRINK),
            new MenuItem("카페라떼", 3000, Category.DRINK),
            new MenuItem("카푸치노", 3500, Category.DRINK),
            new MenuItem("치즈버거", 5500, Category.FOOD),
            new MenuItem("감자튀김", 2500, Category.FOOD)
    };

    public void printMenu() {
        System.out.println("===== 메뉴판 =====");

        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " 
                    + menuItems[i].getName() 
                    + " - " 
                    + menuItems[i].getPrice() 
                    + "원");
        }
    }

    public String getMenuName(int index) {
        return menuItems[index].getName();
    }

    public int getMenuPrice(int index) {
        return menuItems[index].getPrice();
    }

    public int getMenuCount() {
        return menuItems.length;
    }

    public Category getMenuCategory(int index) {
        return menuItems[index].getCategory();
    }

    public boolean isDrink(int index) {
        return menuItems[index].isDrink();
    }

    public boolean isFood(int index) {
        return menuItems[index].isFood();
    }

    public MenuItem getMenuItem(int index) {
        return menuItems[index];
    }
}