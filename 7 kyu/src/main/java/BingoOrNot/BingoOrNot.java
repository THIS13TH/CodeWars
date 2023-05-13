package BingoOrNot;

class BingoOrNot {
    private static final String WIN = "WIN";
    private static final String LOSE = "LOSE";

    public static String bingo(int[] numberArray) {
        //Bingo ( Or Not )
        int[] bingo = {2, 9, 14, 7, 15};

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < numberArray.length; j++) {
                if (bingo[i] == numberArray[j]) {
                    return WIN;
                }
            }
        }
        return LOSE;
    }
}
