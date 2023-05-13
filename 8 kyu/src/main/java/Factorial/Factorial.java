package Factorial;

import static java.util.stream.IntStream.rangeClosed;

class Factorial {
    //Factorial
    public static long factorial(int n) {
        if (n <= 1) return 1;
        else return n * factorial(n - 1);
    }
}
