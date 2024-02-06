
public class Main {
    public static void main(String[] args) {
        String a = "コンパイラ";
        String b = "インタプリタ";
        String c = "ソースコード";
        String d = "バイトコード";
        String e = "JVM";

        System.out.printf("Javaでプログラムを開発するためには、%sと%sというソフトウェアが必要です。\n", a, b);
        System.out.printf("%sは、私たちがJavaの文法に沿って記述した%sを%sに変換してくれます。\n", a, c, d);
        System.out.printf("%sは内部に持っている%sという仕組みを使ってこれを解釈し、マシン後に変換してCPUに送り,CPUは命令を実行します。\n", b, e);
    }
}
