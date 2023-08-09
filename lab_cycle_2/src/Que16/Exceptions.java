

//Write a program to illustrate exception handling in Java for the following exception.
//a. Number format exception
//b. Null point exception
package Que16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void getAge() {
        Scanner sc = new Scanner(System.in);
        String age;
        String name=null;
   
        try {
            System.out.print("Enter your age: ");
            age = sc.nextLine();
            int number_age = Integer.parseInt(age);
            System.out.print("You are " + number_age + " years old ");
        } catch (NumberFormatException e) {
            System.out.println("Age must be in numbers.");
        } 
        
        try{
            System.out.print("\nEnter your name: ");
            name = sc.nextLine();
            name = null;
            System.out.println(name.length());
        }
        catch (NullPointerException e) {
            System.out.println("null pointer exception caught .");
        }
        
        
        
    }

    public static void main(String[] args) {
        getAge();
    }
}

