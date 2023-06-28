package LargestElements;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int[] largest(int n, int[] arr) {
        ArrayList<Integer> tmp = new ArrayList<>();

        Arrays.sort(arr);


        for (int i = arr.length - n; i < arr.length; i++) {
            tmp.add(arr[i]);
        }
        return tmp.stream().mapToInt(i -> i).toArray();
    }
}
