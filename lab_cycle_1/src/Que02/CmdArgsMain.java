package Que02;

public class CmdArgsMain {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        CmdArgs ob = new CmdArgs(N, args[1]);
        ob.Print();
    }
}
