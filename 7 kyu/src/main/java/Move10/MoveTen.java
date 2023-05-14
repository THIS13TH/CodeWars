package Move10;

public class MoveTen {
    public static String moveTen(String s) {
        //Move 10
        char[] c = s.toCharArray();
        String result = "";
        for (int i = 0; i < c.length; i++) {
            int b = c[i] + 10;
            char a = ' ';
            if (b > 122) {
                a = (char) (b - (122 - 96));
            } else {
                a = (char) b;
            }
            result += "" + a;
        }
        return result;
    }
}