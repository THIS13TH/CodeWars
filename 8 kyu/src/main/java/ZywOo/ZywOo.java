package ZywOo;

import java.util.ArrayList;

class ZywOo {

    public static int[] multipleOfIndex(int[] array) {
        //Multiple of index
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                temp.add(array[i]);
            }
        }
        int[] done = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            done[i] = temp.get(i);
        }
        return done;
    }

    public static int sumOfDifferences(int[] arr) {
        //Sum of differences in array
        if (arr.length < 2) return 0;
        int max = arr[0], min = max;
        for (int a : arr)
            if (a > max) max = a;
            else if (a < min) min = a;
        return max - min;
    }

    public static String warnTheSheep(String[] array) {
        //A wolf in sheep's clothing
        int wolf = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == "wolf") {
                wolf = i;
            }
        }

        if (wolf == (array.length - 1)) {
            return "Pls go away and stop eating my sheep";
        } else {
            return "Oi! Sheep number " + (array.length - wolf - 1) + "! You are about to be eaten by a wolf!";
        }
    }

    public static int[] take(int[] arr, int n) {
        //Enumerable Magic #25 - Take the First N Elements
        if (n > 0 && arr.length >= n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = arr[i];
            }
            return result;
        }
        if (n > 0 && arr.length < n) return arr;
        return new int[0];
    }
}
