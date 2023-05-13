package Money;

class Money {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        //Money, Money, Money
        int years = 0;
        while (principal < desired) {
            double sum = principal * interest;
            double taxing = sum * tax;
            principal += sum - taxing;
            years++;
        }
        return years;
    }
}
