package n_10.n_3;

public class Hero {
    String name;
    int hp = 10;

    public void sleep() {
        this.hp = 100;
        System.out.printf("%sは、眠って回復した！\n", this.name);
    }

    public void sit(int sec) {
        this.hp += sec;
        System.out.printf("%sは、%d秒座った！\n", this.name, sec);
        System.out.printf("HPが%dポイント回復した！\n", sec);
    }

    public void slip() {
        this.hp -= 5;
        System.out.printf("%sは、転んだ！\n", this.name);
        System.out.println("5のダメージ！");
    }

    public void run() {
        System.out.printf("%sは、逃げ出した！\n", this.name);
        System.out.println("GAMEOVER");
        System.out.printf("最終HPは%dでした\n", this.hp);
    }
}
