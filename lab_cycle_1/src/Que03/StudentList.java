package Que03;

import java.util.Scanner;
public class StudentList {
    private int N;
    private Student[] details;
    Scanner get=new Scanner(System.in);
    public StudentList(){
        System.out.print("Enter number of students: ");
        N=get.nextInt();
        get.nextLine();
        details=new Student[N];
    }
    public void readDetails(){
        String name;
        int rollNo;
        int[] marks=new int[5];
        for (int i=0;i<N;i++){
            System.out.print("Enter name:");
            name=get.nextLine();
            System.out.print("Enter roll no:");
            rollNo=get.nextInt();
            get.nextLine();
            System.out.println("Enter marks of 5 subjects:");
            for (int j=0;j<5;j++){
                marks[j]=get.nextInt();
                get.nextLine();
            }
            details[i]=new Student(name,rollNo,marks);
        }
        get.close();
    }

    public void sortDescending(){
        int i,j;
        for(i=1;i<N;i++){
            Student key=details[i];
            j=i-1;
            while(j>=0 && key.getTotal()>details[j].getTotal()){
                details[j+1]=details[j];
                j--;
            }
            details[j+1]=key;
        }
    }

    public void print(){
        System.out.println("********************STUDENT DETAILS********************");
        for (int i=0;i<N;i++){
            details[i].printDetails();
        }
    }
}
