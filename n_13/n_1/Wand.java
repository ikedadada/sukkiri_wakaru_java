package n_13.n_1;

public class Wand {
    private String name;
    private double power;

    public Wand(String name, double power) {
        this.setName(name);
        this.setPower(power);
    }

    public String getName() {
        return this.name;
    }

    public double getPower() {
        return this.power;
    }

    private void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("杖に設定されようとしている名前が異常です");
        }
        this.name = name;
    }

    private void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("杖に設定されようとしている魔力が異常です");
        }
        this.power = power;
    }
}
