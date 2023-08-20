package Que12;

public class ArrayMain {
    public static void main(String[] args){
        ArrayMenu menu=new ArrayMenu();
        do {
            menu.printMenu();
            menu.setChoice();
            switch (ArrayMenu.getChoice()) {
                case 1 -> menu.addLast();
                case 2 -> menu.addToPosition();
                case 3 -> menu.search();
                case 4 -> menu.remove();
                case 5 -> menu.print();
                case 6 -> System.out.println("Thank you for using the program");
                default -> System.out.println("Invalid choice!!!");
            }
        } while (ArrayMenu.getChoice() != 6);
    }
}
