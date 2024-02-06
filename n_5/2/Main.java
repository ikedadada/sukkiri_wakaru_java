public class Main {
    static void email(String title, String address, String text) {
        System.out.printf("%sにメールを送信しました。\n件名: %s\n本文: %s\n", address, title, text);
    }

    public static void main(String[] args) {
        String title = "お誘い";
        String address = "java_learning@example.com";
        String text = "今度、飲みに行きませんか？";
        email(title, address, text);
    }
}
