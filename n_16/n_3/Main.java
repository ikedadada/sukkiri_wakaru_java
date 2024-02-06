package n_16.n_3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Hero saito = new Hero("斎藤");
        Hero suzuki = new Hero("鈴木");

        Map<Hero, Integer> heroes = Map.of(saito, 3, suzuki, 7);

        for (Hero h : heroes.keySet()) {
            System.out.println(h.getName() + "が倒した敵=" + heroes.get(h));
        }
    }
}

class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
