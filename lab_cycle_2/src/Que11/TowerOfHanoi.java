package Que11;

import java.util.Scanner;
class TowerOfHanoi {
    public TowerOfHanoi(){
        System.out.print("Enter number of rods: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n,'A','C','B');
    }
    void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod){
        if (n==1){
            System.out.printf("Move disk 1 from rod %c to rod %c %n",from_rod,to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.printf("Move disk %d from rod %c to rod %c %n",n,from_rod,to_rod);
        towerOfHanoi(n-1,aux_rod,to_rod,from_rod);
    }
}
