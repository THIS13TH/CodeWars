package BasicCalculator;

public class Calculator {
    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        if (numberOne == 0 || numberTwo == 0 && operation.equals("/")) return null;
        if (operation.equals("*")) return numberOne * numberTwo + 0.0;
        else if (operation.equals("-")) {
            return numberOne - numberTwo;
        } else if (operation.equals("/")) {
            return numberOne / numberTwo;
        } else if (operation.equals("+")) {
            return numberOne + numberTwo;
        } else {
            return null;
        }
    }
}
