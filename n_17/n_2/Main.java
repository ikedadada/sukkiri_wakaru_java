package n_17.n_2;

public class Main {
    public static void main(String[] args) {
        main1();
    }

    @SuppressWarnings("null")
    static void main1() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException例外をcatchしました");
            System.out.println("---スタックトレース（ここから）---");
            e.printStackTrace();
            System.out.println("---スタックトレース（ここまで）---");
        }

    }
}
