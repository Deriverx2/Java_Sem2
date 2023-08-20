package Que16;

import java.util.Scanner;

class ExceptionDemo {
    private String str = null;

    public void NumberFormatExceptionDemo() {
        System.out.println("Number Format Exception Handling");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter a number:");
            str = scan.nextLine();
            int a = Integer.parseInt(str);
            System.out.println("You entered: " + a);
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("You should enter a number!!!");
            System.out.println();
        } catch (Exception e){
            System.out.println("Something happened!!");
            System.out.println();
        } finally{
            scan.close();
        }
    }

    public void NullPointerExceptionDemo(String a){
        System.out.println("Null Pointer Exception Handling");
        try {
            System.out.println();
            System.out.println("String is of length: " + a.length());
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println("String is Null");
        } finally {
            System.out.println("Null string length cannot be found ");
            System.out.println();
        }
    }
}
