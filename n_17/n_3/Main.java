package n_17.n_3;

public class Main {
    public static void main(String[] args) {
        try {
            String s = "三";
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException例外をcatchしました");
            System.out.println("---スタックトレース（ここから）---");
            e.printStackTrace();
            System.out.println("---スタックトレース（ここまで）---");
        }

    }
}
