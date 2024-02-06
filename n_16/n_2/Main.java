package n_16.n_2;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hero saito = new Hero("斎藤");
        Hero suzuki = new Hero("鈴木");

        ArrayList<Hero> heros = new ArrayList<>(Arrays.asList(saito, suzuki));
        for (Hero h : heros) {
            System.out.println(h.getName());
        }
    }
}

// ローカルクラスは、Mainよりも先に宣言するとコンパイルエラーになる
class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
