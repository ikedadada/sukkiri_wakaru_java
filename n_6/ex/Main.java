package n_6.ex;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int total = n_6.ex.CalcLogic.tasu(a, b);
        int delta = CalcLogic.hiku(a, b);
        System.out.printf("total: %d, delta: %d\n", total, delta);
    }
}
