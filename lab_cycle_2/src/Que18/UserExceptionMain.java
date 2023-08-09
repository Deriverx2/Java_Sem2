package Que18;

import java.util.Scanner;


public class UserExceptionMain {
    
    static void checkAge(int age) throws customException{
            if(age>=12 && age<=55){
                System.out.println("You shall enter the ride");
            }else{
                throw new UserException("must be of age between 12 and 55");
            }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        
        try{
            checkAge(age);
        }
        catch(Exception e){
            System.out.println("Age exception caught "+e);
        }
    }
    
    
