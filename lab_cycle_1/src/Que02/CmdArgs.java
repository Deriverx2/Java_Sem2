package Que02;

public class CmdArgs {
    private int N;
    private String print;

    public CmdArgs(int N, String print) {
        this.N = N;
        this.print = new String(print);
    }

    public void Print() {
        for (int i = 0; i < N; i++) {
            System.out.println(print);
        }
    }
}