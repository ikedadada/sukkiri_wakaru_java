package n_15.n_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("全ての文字列にマッチする");
        System.out.println(matchAllString("a"));
        System.out.println(matchAllString("aa"));
        System.out.println(matchAllString(""));
        System.out.println("aの後に数字が続く");
        System.out.println(matchPattern2("A"));
        System.out.println(matchPattern2("A0"));
        System.out.println(matchPattern2("A01"));
        System.out.println("Uの後に大文字のアルファベットが3つ続く");
        System.out.println(matchPattern3("U"));
        System.out.println(matchPattern3("UAA"));
        System.out.println(matchPattern3("UAAA"));
        System.out.println(matchPattern3("UAAa"));
    }

    static boolean matchAllString(String s) {
        return s.matches(".*");
    }

    static boolean matchPattern2(String s) {
        return s.matches("A[0-9]{1,2}");
    }

    static boolean matchPattern3(String s) {
        return s.matches("U[A-Z]{3}");
    }
}
