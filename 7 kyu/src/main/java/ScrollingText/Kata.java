package ScrollingText;

public class Kata {
    public static String[] scrollingText(String text) {
        //Scrolling Text
        String[] result = new String[text.length()];
        StringBuilder tmp = new StringBuilder(text.toUpperCase());
        for (int i = 0; i < result.length; i++) {
            result[i] = tmp.toString();
            tmp.append(tmp.charAt(0)).deleteCharAt(0);
        }
        return result;
    }
}

