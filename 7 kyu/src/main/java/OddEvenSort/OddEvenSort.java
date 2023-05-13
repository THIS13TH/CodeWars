package OddEvenSort;

class OddEvenSort {
    public static String sortMyString(String s) {
        //Odd-Even String Sort
        var first = new StringBuilder();
        var second = new StringBuilder();
        for (var i = 0; i < s.length(); i++) {
            (i % 2 == 0 ? second : first).append(s.charAt(i));
        }
        return second.append(" ").append(first).toString();
    }
}
