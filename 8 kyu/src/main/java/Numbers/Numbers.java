package Numbers;

class Numbers {
    public static double TwoDecimalPlaces(double number) {
        //Formatting decimal places #0
        return Double.parseDouble(String.format("%.2f", number));
    }
}
