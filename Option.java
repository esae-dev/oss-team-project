public class Option {
    public void printOptions() {
        System.out.println("===== 음료 옵션 =====");
        System.out.println("1. HOT +0원");
        System.out.println("2. ICED +500원");
    }

    public String getOption(int choice) {
        if (choice == 1) {
            return "HOT";
        }
        if (choice == 2) {
            return "ICED";
        }
        return "INVALID";
    }

    public int getOptionPrice(int choice) {
        if (choice == 1) {
            return 0;
        }
        if (choice == 2) {
            return 500;
        }
        return 0;
    }

    public boolean isValidOption(int choice) {
        return choice == 1 || choice == 2;
    }
}