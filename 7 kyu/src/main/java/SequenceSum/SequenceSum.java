package SequenceSum;

class SequenceSum {
    public static String showSequence(int value) {
        //Sum of numbers from 0 to N
        if (value < 0) {
            return value + "<0";
        }

        if (value == 0) {
            return "0=0";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= value; i++) {
            result = result.append(i + "+");
        }
        result = result.deleteCharAt(result.length() - 1);

        int total = (value * (value + 1) / 2);
        result = result.append(" = " + total);

        return result.toString();
    }

}
