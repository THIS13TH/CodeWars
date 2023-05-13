package TwiceAsOld;

class TwiceAsOld {
    //Twice as old
    public static int TwiceAsOld(int dadYears, int sonYears) {
        int twice = dadYears - sonYears * 2;
        return twice < 0 ? twice * (-1) : twice;

    }
}
