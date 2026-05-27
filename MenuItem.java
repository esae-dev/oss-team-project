public class MenuItem {
    private String name;
    private int price;
    private Category category;

    public MenuItem(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isDrink() {
        return category == Category.DRINK;
    }

    public boolean isFood() {
        return category == Category.FOOD;
    }
}