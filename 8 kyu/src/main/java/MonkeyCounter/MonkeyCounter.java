package MonkeyCounter;

class MonkeyCounter {
    public static int[] monkeyCount(final int n) {
        //Count the Monkeys!
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
