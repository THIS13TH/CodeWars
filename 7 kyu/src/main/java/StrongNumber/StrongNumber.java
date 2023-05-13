package StrongNumber;

class StrongNumber {
    public static String isStrongNumber(int num) {
        //Strong Number (Special Numbers Series #2)
        String factorial = Integer.toString(num);
        int strong = 0;
        int fact = 0;
        int sum = 0;
        for (int i = 0; i < factorial.length(); i++) {
            fact = 1;
            strong = Character.getNumericValue(factorial.charAt(i));
            for (int j = 1; j <= strong; j++) {
                fact *= j;
            }
            sum += fact;
        }

        return (num == sum) ? "STRONG!!!!" : "Not Strong !!";
    }
}
