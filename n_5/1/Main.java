public class Main {
    void introduceOneself() {
        String name = "池田晃一";
        int age = 32;
        double height = 170.5;
        char zodiac = '申';

        System.out.printf("私の名前は%sです。年齢は%d歳です。身長は%3.1f.0cmです。干支は%cです。\n", name, age, height, zodiac);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.introduceOneself();
    }
}
