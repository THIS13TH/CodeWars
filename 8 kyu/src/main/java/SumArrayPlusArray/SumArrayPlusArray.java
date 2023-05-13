package SumArrayPlusArray;

import static java.util.Arrays.stream;

class SumArrayPlusArray {
    //Array plus array
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return stream(arr1).sum() + stream(arr2).sum();
    }

}
