package ArithmeticFunction;

class ArithmeticFunction {
    //Make a function that does arithmetic!
    public static int arithmetic(int a, int b, String operator) {
        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            default:
                return a / b;
        }
    }
}
