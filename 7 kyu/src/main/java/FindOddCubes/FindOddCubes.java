package FindOddCubes;

class FindOddCubes {
    //Sum of Odd Cubed Numbers
    public static int cubeOdd(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 3);
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
