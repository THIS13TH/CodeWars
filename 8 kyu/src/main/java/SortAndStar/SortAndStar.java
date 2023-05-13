package SortAndStar;

import static java.util.Arrays.sort;

class SortAndStar {
    //Sort and Star
    public static String twoSort(String[] s) {
        sort(s);
        return String.join("***", s[0].split(""));

    }
}
