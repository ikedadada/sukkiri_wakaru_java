public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // a. cost = 100 * 1.08 is not boolean
        // b. 3 is not boolean
        int age = 30;
        boolean c = age != 30;
        boolean d = true;
        int eb = 4;
        boolean e = eb + 5 < 20;
        // f isNumeric = true is not boolean
    }
}
