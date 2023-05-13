package NewAverage;

class NewAverage {
    public static long newAvg(double[] arr, double navg) {
        //Looking for a benefactor
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        long answer = (long) Math.ceil((arr.length + 1) * navg - sum);
        if (answer < 0) {
            throw new IllegalArgumentException();
        }
        return answer;
    }
}
