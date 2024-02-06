
public class Main {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.printf("占い師 > ようこそ占いの館へ\n");

            String name;
            for (;;) {
                System.out.printf("占い師 > あなたの名前を入力してください\nあなた > ");
                name = scanner.nextLine();
                if (name.length() == 0) {
                    System.out.printf("占い師 > 名前が入力されていません。\n");
                } else {
                    break;
                }
            }
            int age;
            for (;;) {
                System.out.printf("占い師 > あなたの年齢を入力してください\nあなた > ");
                String ageString = scanner.nextLine();
                if (ageString.length() == 0) {
                    System.out.printf("占い師 > 年齢が入力されていません。\n");
                } else {
                    try {
                        age = Integer.parseInt(ageString);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.printf("占い師 > 年齢が数字ではありません。\n");
                    }
                }
            }
            int fortune = new java.util.Random().nextInt(4);
            fortune++;
            System.out.printf("占い師 > 占いの結果が出ました！\n");
            System.out.printf("占い師 > %s(%s歳)さん、あなたの運気番号は%sです。\n", name, age, fortune);
            System.out.printf("1:大吉 2:中吉 3:吉 4:凶\n");
        }
    }
}