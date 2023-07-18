package Que07;

public class BankMain {
    public static void main(String[] args) {
        BankMenu menu = new BankMenu();
        do {
            menu.printMenu();
            menu.setChoice();
            switch (BankMenu.getChoice()) {
                case 1, 2:
                    menu.setAccount();
                    break;
                case 3:
                    menu.depositAmount();
                    break;
                case 4:
                    menu.withdrawAmount();
                    break;
                case 5:
                    menu.statement();
                    break;
                case 6:
                    System.out.println("Thank you for using the program");
                    break;
                default:
                    System.out.println("Invalid choice!!!");
            }
        } while (BankMenu.getChoice() != 6);
    }
}
