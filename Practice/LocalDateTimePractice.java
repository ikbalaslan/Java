package practice.withagroup;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimePractice {
    public static void main(String[] args) {
        LocalDateTime local1 = LocalDateTime.of(1922,12,2,2,2,2);
        LocalDateTime local2 = LocalDateTime.of(1925,12,2,2,2,2);
        long x =ChronoUnit.HOURS.between(local1,local2);

        System.out.println(x);

    }
}
