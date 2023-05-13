package Sid;

class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        //I love you, a little , a lot, passionately ... not at all
        String[] arr = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        return arr[(nb_petals - 1) % 6];
    }

    public static int simpleMultiplication(int n) {
        //Simple multiplication
        return n % 2 == 0 ? n * 8 : n * 9;
    }
}
