package n_13.n_1;

@SuppressWarnings("unused")
public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    Wizard(String name, int hp, int mp, Wand wand) {
        this.setHp(hp);
        this.setMp(mp);
        this.setName(name);
        this.setWand(wand);
    }

    private void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("魔法使いに設定されようとしている名前が異常です");
        }
        this.name = name;
    }

    private void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
    }

    private void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("魔法使いに設定されようとしているMPが異常です");
        }
        this.mp = mp;
    }

    private void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("魔法使いに設定されようとしている杖が異常です");
        }
        this.wand = wand;
    }

    void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }
}
