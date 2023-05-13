package SumArray;

class SumArray {
    //Sum Arrays
    public static double sum(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
