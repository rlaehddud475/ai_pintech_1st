package exam03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex04 {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        /*LocalDate after100=today.plus(100l, ChronoUnit.DAYS);
        LocalDate before100=today.minus(100l, ChronoUnit.DAYS);*/
        LocalDate after100=today.plusDays(100l);
        LocalDate before100=today.minusDays(100l);
        System.out.println(after100);
        System.out.println(before100);
        LocalDate date2=before100.withMonth(12);
        System.out.println(date2);
    }
}
