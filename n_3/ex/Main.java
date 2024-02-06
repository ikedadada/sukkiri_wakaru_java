import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        // try (var scanner = new java.util.Scanner(System.in)) {
        // for (;;) {
        // try {
        // System.out.printf("天気は？(true/false): ");
        // boolean tenki = scanner.nextBoolean();
        // if (tenki) {
        // System.out.println("洗濯をします");
        // System.out.println("散歩に行きます");
        // } else {
        // System.out.println("DVDを見ます");
        // }
        // break;
        // } catch (java.util.InputMismatchException e) {
        // System.out.println("入力が不正です");
        // scanner.next();
        // }
        // }
        // }

        String a = "すっきり";
        String m = "すっき";
        String b = m + "り";
        if (a == b) {
            System.out.println("a");
        } else if (a.equals(b)) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }
    }

    public static void tmp(InputStream inputStream) {
        //
    }

    public static void tmp2() {
        Main.tmp(System.in);
    }
}
