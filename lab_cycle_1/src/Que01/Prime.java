package Que01;

class Prime {
    private int N;
    private int count=0;
    public Prime(int N){
        this.N=N;
    }
    public void print() {
        int j;
        for (int i = 2; count < N; i++) {
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > i / 2) {
                System.out.println(i);
                count++;
            }
        }
    }
}
