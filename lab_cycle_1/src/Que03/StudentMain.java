package Que03;

public class StudentMain {
    public static void main(String[] args){
        StudentList students=new StudentList();
        students.readDetails();
        students.sortDescending();
        students.print();
    }
}
