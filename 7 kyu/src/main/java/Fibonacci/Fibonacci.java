package Fibonacci;

public class Fibonacci {
    public static long fib (int n){
        long f1 = 0;
        long f2 = 1;
        long f3 = 1;
        for(int i = 1; i < n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
