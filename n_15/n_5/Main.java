package n_15.n_5;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate i1 = LocalDate.now();
        i1 = i1.plusDays(100);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(i1.format(fmt));

    }
}
