package Que13;


import java.util.Scanner;

class PascalTriangle {
    private int rows;

    public PascalTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter # of rows:");
        rows = sc.nextInt();
        sc.close();
    }

    public long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public long binomialCoefficient(int row, int i) {
        return factorial(row) / (factorial(i) * factorial(row - i));
    }

    public void printTri() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + "\t");
            }
            System.out.println();
        }
    }
}
