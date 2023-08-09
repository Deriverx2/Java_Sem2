/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Que13;

import java.util.Scanner;

class Pascal{
    
    int factorial(int n){
        int p = 1;
        while(n>=1){
            p=p*n;
            n=n-1;
        }
    return p;
    }
    
    int ncr(int a,int b){
        
        int x=factorial(a);
        int y=factorial(b);
        int c=factorial((a-b));
        int result = x/(y*c); 
    
        return result;
    }
    
    void printPascal(int n){
        int r,i=0;
        while(i<=n-1){
        r=0;
  
        for(int j=1;j<n-i;j++){
            System.out.print(" ");
        }
        while(r<=i){
            System.out.print(ncr(i,r)+" ");
        r++;
    }
    System.out.println();
    i++;
}
    }
}
public class PascalTriangle {
    public static void main(String[] args){
        Pascal pascal = new Pascal();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of lines : ");
        int n = sc.nextInt();
        pascal.printPascal(n);
    }
}
