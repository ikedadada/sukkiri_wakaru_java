package n_10.n_3;

public class PoisonMatango extends Matango {
    int remainingPoisonAttackCount = 5;

    PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);
        if (this.remainingPoisonAttackCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int damage = h.hp / 5;
            h.hp -= damage;
            System.out.println(damage + "ポイントのダメージ！");
            this.remainingPoisonAttackCount--;
        }
    }
}
