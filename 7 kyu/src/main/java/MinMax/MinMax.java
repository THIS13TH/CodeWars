package MinMax;

import static java.util.Arrays.sort;

class MinMax {
    public static int[] minMax(int[] arr) {
        //The highest profit wins!
        if (arr.length == 1) {
            return new int[]{arr[0], arr[0]};
        } else {
            sort(arr);
        }
        return new int[]{arr[0], arr[arr.length - 1]};
    }
}
