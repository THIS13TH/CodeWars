package ExtraPerfectNumbersSpecialNumbersSeries7;

import java.util.ArrayList;

public class Solution {

    public static int[] extraPerfect(int number) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= number; i += 2) {
            arr.add(i);
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }

}
