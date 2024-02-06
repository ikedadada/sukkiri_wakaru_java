public class Main {
    public static void main(String[] args) {
        int a = 3 / 2;
        double b = 3 / 2;
        System.out.printf("3/2の商は%sです。\n", a);
        System.out.printf("3/2の商は%sです。\n", b);

        String msg = "私の年齢は" + 23;
        System.out.printf("%sです。\n", msg);

        String age = "23";
        int n = Integer.parseInt(age);
        System.out.printf("あなたは来年、%s歳になりますね。\n", n + 1);

        int r = new java.util.Random().nextInt(90);
        System.out.printf("あなたはたぶん、%s歳ですね？\n", r);

        // System.out.println("あなたの名前を入力してください。");
        // @SuppressWarnings("resource")
        // String input = new java.util.Scanner(System.in).nextLine();
        // System.out.printf("あなたはたぶん、%s歳ですね？\n", input);

        // Closableを実装しているクラスは明示的にclose()を呼び出す必要がある。
        // ただし、try-with-resources文を使うと、自動的にclose()が呼び出される。
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.println("あなたの名前を入力してください。");
            String input_name = scanner.nextLine();
            System.out.printf("あなたの年齢を入力してください。\n");
            int input_age = scanner.nextInt();
            System.out.printf("こんにちは、%s(%s歳)さん。\n", input_name, input_age);
        }

    }
}
