package ArraysCodeWars;

class ArraysCodeWars {
    public static int findSmallest(final int[] numbers, final String toReturn) {
        //Smallest value of an array
        int value = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < value) {
                index = i;
                value = numbers[i];
            }
        }
        if (toReturn.equals("value")) {
            return value;
        } else {
            return index;
        }
    }
}
