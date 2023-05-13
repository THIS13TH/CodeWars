package SmallestIntegerFinder;

class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        //Find the smallest integer in the array
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;
    }
}
