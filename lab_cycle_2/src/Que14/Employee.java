
package Que14;



import java.util.Scanner;

//Write a program to create a class employee having members Employee id, Employee name, date of birth, date of joining, and salary.
//Read the details of n employees, sort the employee list in the descending order of salary, and print it. (
//Note use nested class for date of birth and date of joining

public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private DateOfJoining joinDate = new DateOfJoining();
    private DateOfBirth dob = new DateOfBirth();
    
    static class DateOfBirth{
        private int day,month,year;
        
        public void getBirthDate(){
           System.out.println("==== Date Of Birth ====");
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter Birth year : ");
           year = sc.nextInt();
           System.out.print("Enter Birth Month : ");
           month = sc.nextInt();
           System.out.print("Enter Day : ");
           day = sc.nextInt();
        }
        
        public void printBirthDate(){
            System.out.println("Birth Date : "+day+"/"+month+"/"+year);
        }
    }
    
    static class DateOfJoining{
        private int day,month,year;
        public void getJoinDate(){
           System.out.println("==== Joining Details ====");
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter Joining year : ");
           year = sc.nextInt();
           System.out.print("Enter Joining Month : ");
           month = sc.nextInt();
           System.out.print("Enter Join Day : ");
           day = sc.nextInt();
        }
        
        public void printJoinDate(){
            System.out.println("Join Date : "+day+"/"+month+"/"+year);
        }
    }
    
    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Employee ID : ");
        employeeId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name : ");
        employeeName = sc.nextLine();
        joinDate.getJoinDate();
        dob.getBirthDate();
        System.out.print("Enter Employee Salary : ");
        salary = sc.nextDouble();
    }
    
    public void printDetails(){
        System.out.println("\nEmployee Name : "+employeeName);
        System.out.println("Employee ID : "+employeeId);
        dob.printBirthDate();
        joinDate.printJoinDate();
        System.out.println("Employee Salary : "+salary);
    }
    public double getSalary(){
        return salary;
    }
}
