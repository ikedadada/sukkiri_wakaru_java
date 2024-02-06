package n_14.n_2;

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    public void selfAid() {
        System.out.printf("%sは、セルフエイドを唱えた！\n", this.name);
        this.hp = MAX_HP;
        this.mp -= 5;
        System.out.printf("HPが最大まで回復した！\n");
    }

    public int pray(int sec) {
        System.out.printf("%sは、%d秒間天に祈った！\n", this.name, sec);
        int recover = new java.util.Random().nextInt(3) + sec;
        int recoverActual = Math.min(MAX_MP - this.mp, recover);
        this.mp += recoverActual;
        System.out.printf("MPが%d回復した！\n", recoverActual);
        return recoverActual;
    }
}
