package ReverseLonger;

class ReverseLonger {
    public static String shorterReverseLonger(String a, String b) {
        //shorter concat [reverse longer]
        return a.length() >= b.length() ?
                b + new StringBuilder(a).reverse() + b :
                a + new StringBuilder(b).reverse() + a;
    }
}
