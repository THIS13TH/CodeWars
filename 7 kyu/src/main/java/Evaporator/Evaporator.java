package Evaporator;

class Evaporator {

    public static int evaporator(double content, double evap_per_day, double threshold) {
        //Deodorant Evaporator
        int result = 0;
        double percentage = 100;
        while (percentage > threshold) {
            percentage -= percentage * (evap_per_day / 100);
            result++;
        }

        return result;
    }
}
