package WilsonPrime;

class WilsonPrime {
    public static boolean am_i_wilson(double n) {
        //Wilson primes
        double mod = n * n;
        double fact = 1;
        for (int i = 2; i < n; i++) {
            fact = (fact * i) % mod;
        }
        return fact + 1 == mod;
    }
}
