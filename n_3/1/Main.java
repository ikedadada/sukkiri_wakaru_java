public class Main {
    public static void main(String[] args) {
        Main.main1(60);
        Main.main2(15, 16);
        Main.main3(21);
        Main.main4("湊");
    }

    static void main1(int weight) {
        boolean isWeight60 = weight == 60;
        if (isWeight60) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }

    static void main2(int age1, int age2) {
        boolean isTotalOver60 = 2 * (age1 + age2) > 60;
        if (isTotalOver60) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }

    static void main3(int age) {
        boolean isAgeOdd = age % 2 == 1;
        if (isAgeOdd) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }

    static void main4(String name) {
        boolean isNameEqual = name.equals("湊");
        if (isNameEqual) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}
