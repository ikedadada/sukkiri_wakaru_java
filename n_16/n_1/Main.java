package n_16.n_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. -----------------");
        main1();
        System.out.println("2. -----------------");
        main2();
        System.out.println("3. -----------------");
        main3();
    }

    static void main1() {
        System.err.println("HashSet");
        Set<String> prefectures = new HashSet<>(
                Arrays.asList("北海道", "青森", "秋田", "秋田"));
        for (String p : prefectures) {
            System.out.println(p);
        }
        System.err.println("LinkedHashSet");
        Set<String> prefectures2 = new LinkedHashSet<String>(
                Arrays.asList("北海道", "青森", "秋田", "秋田"));
        for (String p : prefectures2) {
            System.out.println(p);
        }
        System.err.println("TreeSet");
        Set<String> prefectures3 = new TreeSet<String>(Arrays.asList("北海道", "青森", "秋田", "秋田"));
        for (String p : prefectures3) {
            System.out.println(p);
        }
    }

    static void main2() {
        List<Integer> c = Arrays.asList(40, 20, 60, 80, 100);
        for (int i : c) {
            System.out.println(i + "点");
        }
    }

    static void main3() {
        Map<String, Integer> m = Map.of("岸田 文雄", 817, "菅 義偉", 384, "安倍 晋三", 1051);

        for (String k : m.keySet()) {
            System.out.println(k + "さんは" + m.get(k) + "日です");
        }
    }
}
