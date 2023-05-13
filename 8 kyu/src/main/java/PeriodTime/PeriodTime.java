package PeriodTime;

import java.time.LocalDate;

class PeriodTime {
    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        //Is your period late?
        return today.minusDays(cycleLength).isAfter(last);
    }
}
