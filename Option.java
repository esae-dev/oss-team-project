public class Option {
      public void printOptions() {
        System.out.println("===== 음료 옵션 =====");
        System.out.println("1. HOT");
        System.out.println("2. ICED");
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
        public boolean isValidOption(int choice) {
        return choice == 1 || choice == 2;
    }
}