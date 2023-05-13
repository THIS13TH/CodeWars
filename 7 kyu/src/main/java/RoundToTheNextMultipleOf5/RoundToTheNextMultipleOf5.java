package RoundToTheNextMultipleOf5;

class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
        //Round up to the next multiple of 5
        while (number % 5 != 0) {
            number++;
        }
        return number;
    }
}
