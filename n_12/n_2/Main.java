package n_12.n_2;

public class Main {
    public static void main(String[] args) {
        main2(args);
        main3(args);
    }

    public static void main1(String[] args) {
        X obj = new A();
        obj.a();
        // obj.b(); // 呼べない
        // obj.c(); // 呼べない
    }

    public static void main2(String[] args) {
        Y y1 = new A();
        Y y2 = new B();

        y1.a();
        y2.a();
    }

    public static void main3(String[] args) {
        Y[] Y = new Y[2];
        Y[0] = new A();
        Y[1] = new B();

        for (Y y : Y) {
            y.b();
        }
    }
}
