package Arge;

class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        //Growth of a Population
        double habitants = 0;
        int result = 0;
        while (habitants < p) {
            habitants = p0 + (p0 * (percent / 100)) + aug;
            p0 = (int) habitants;
            result++;
        }
        return result;

    }
}
