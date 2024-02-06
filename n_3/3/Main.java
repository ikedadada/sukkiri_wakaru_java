public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("引数の数が違います");
            return;
        }
        int isHungry = Integer.parseInt(args[0]);

        // assertionを機能させるためには、-eaオプションをつけて実行する必要がある
        assert isHungry == 0 || isHungry == 1 : String.format("isHungryの値が不正です: %d", isHungry);

        if (isHungry == 0) {
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです");
            System.out.printf("何を食べますか？%n");
            try (var scanner = new java.util.Scanner(System.in)) {
                String food = scanner.nextLine();
                System.out.printf("%sを食べました%n", food);
                System.out.println("ごちそうさまでした");
            } catch (java.util.InputMismatchException e) {
                System.out.println("入力が不正です");
            } catch (Exception e) {
                System.out.println("予期せぬエラーが発生しました");
            }
        }
    }
}
