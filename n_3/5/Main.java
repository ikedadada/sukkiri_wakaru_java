public class Main {
    public static void main(String[] args) {
        System.out.printf("［メニュ］1:検索 2:登録 3:削除 4:変更＞");
        try (var scanner = new java.util.Scanner(System.in)) {
            int selected = scanner.nextInt();
            switch (selected) {
                case 1 -> System.out.println("検索します");
                case 2 -> System.out.println("登録します");
                case 3 -> System.out.println("削除します");
                case 4 -> System.out.println("変更します");

            }
        }
    }
}
