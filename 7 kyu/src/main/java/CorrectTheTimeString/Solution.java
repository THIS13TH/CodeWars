package CorrectTheTimeString;

public class Solution {
    public static String timeCorrect(String timestring) {
        if (timestring == null || !timestring.matches("^\\d{2}:\\d{2}:\\d{2}$")) {
            return null;
        }
        String[] split = timestring.split(":");
        int h = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int s = Integer.parseInt(split[2]);
        m += s / 60;
        s = s % 60;
        h += m / 60;
        m = m % 60;
        h = h % 24;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}
