package Dinglemouse;

class Dinglemouse {
    public static String replaceDots(final String str) {
        //Replace all dots
        return str.replaceAll("\\.", "-");
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        //Cat years, Dog years
        return new int[]{humanYears, humanYears > 1 ? 16 + 4 * humanYears : 15, humanYears > 1 ? 14 + 5 * humanYears : 15};
    }
}
