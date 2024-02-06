package n_9.n_1;

public class Main {
    public static void heal(int hp) {
        hp += 10;
    }

    public static void heal(Thief thief) {
        thief.hp += 10;
    }

    public static void main(String[] args) {
        int baseHp = 25;
        Thief t = new Thief("アサカ", baseHp);
        heal(baseHp);
        System.out.printf("%sのHP: %d\n", t.name, t.hp);
        heal(t);
        System.out.printf("%sのHP: %d\n", t.name, t.hp);
    }
}
