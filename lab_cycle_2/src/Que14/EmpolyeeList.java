package Que14;


import java.util.Scanner;

class EmpolyeeList {
    private int N;

    private Employee[] business;
    Scanner scan = new Scanner(System.in);

    public EmpolyeeList() {
        System.out.print("Enter number of employees:");
        N = scan.nextInt();
        scan.nextLine();
        business = new Employee[N];
        getDetails();
        scan.close();
    }

    public void getDetails(){
        System.out.println("Enter details of employees");
        int dd, mm, yy;
        String name;
        String id;
        Employee.DateOfBirth dob;
        Employee.DateOfJoining doj;
        double salary;
        for (int i = 0; i < N; i++) {
            System.out.print("\nEnter name of employee:");
            name = scan.nextLine();
            System.out.print("Enter id of employee:");
            id = scan.nextLine();
            System.out.println("Date of birth(dd/mm/yy):");
            do {
                System.out.print("Enter day(1-31):");
                dd = scan.nextInt();
                scan.nextLine();
            } while (dd < 1 || dd > 31);
            do {
                System.out.print("Enter month(1-12):");
                mm = scan.nextInt();
                scan.nextLine();
            } while (mm < 1 || mm > 12);
            do {
                System.out.print("Enter year(1940-2010):");
                yy = scan.nextInt();
                scan.nextLine();
            } while (yy < 1940 || yy > 2010);
            dob = new Employee.DateOfBirth(dd, mm, yy);
            System.out.println("Date of joining(dd/mm/yy):");
            do {
                System.out.print("Enter day(1-31):");
                dd = scan.nextInt();
                scan.nextLine();
            } while (dd < 1 || dd > 31);
            do {
                System.out.print("Enter month(1-12):");
                mm = scan.nextInt();
                scan.nextLine();
            } while (mm < 1 || mm > 12);
            do {
                System.out.print("Enter year(1960-2023):");
                yy = scan.nextInt();
                scan.nextLine();
            } while (yy < 1960 || yy > 2023);
            doj = new Employee.DateOfJoining(dd, mm, yy);
            System.out.print("Enter salary:");
            salary = scan.nextInt();
            scan.nextLine();
            business[i] = new Employee(name, id, dob, doj, salary);
        }
    }
    public void sortToSalary() {
        int i, j;
        Employee key;
        for (i = 1; i < N; i++) {
            key = business[i];
            j = i-1;
            while (j >= 0 && key.getSalary() > business[j].getSalary()) {
                business[j + 1] = business[j];
                j--;
            }
            business[j + 1] = key;
        }
    }

    public void print() {
        System.out.println("******************** Employee Details ********************");
        for (Employee i : business) {
            System.out.println(i);
            System.out.println("**********************************************************");
        }
    }

}
