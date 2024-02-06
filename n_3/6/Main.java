public class Main {
    public static void main(String[] args) {
        System.out.printf("数あてゲーム\n");
        int ans = new java.util.Random().nextInt(10);
        try (var scanner = new java.util.Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                System.out.printf("0~9の数字を入力してください: ");
                int num = scanner.nextInt();
                if (num == ans) {
                    System.out.println("アタリ！");
                    break;
                } else {
                    System.out.println("違います");
                }
            }
        } catch (Exception e) {
            System.out.println("入力が不正です");

        }
        System.out.printf("ゲームを終了します%n");
    }
}
