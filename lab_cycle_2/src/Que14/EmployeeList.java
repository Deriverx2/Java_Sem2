/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Que14;

public class EmployeeList {
    Employee employees[];
    int count;
    
    public EmployeeList(int count){
        this.count = count;
        employees = new Employee[count];
    }
    
    public void getEmployees(){
        for(int i=0;i<count;i++){
            employees[i] = new Employee();
            employees[i].getDetails();
        }
    }
    
    public void sortList(){
        for(int i=1;i<count;i++){
            double key = employees[i].getSalary();
            int j=i-1;
            while(j>=0 && key>employees[j].getSalary()){
                employees[j+1] = employees[j];
            }
            employees[j+1] = employees[i];
        }
    }
    
    public void displaySorted(){
        for(int i=0;i<count;i++){
            employees[i].printDetails();
        }
    }
    
}
