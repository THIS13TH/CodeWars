package StringUtils;

class StringUtils {
    public static boolean isLetter(String s) {
        //Regexp Basics - is it a letter?
        return s.matches("[a-zA-Z]");
    }

    public static boolean isVowel(String s) {
        //Regexp Basics - is it a vowel?
        return s.matches("[aeiouAEIOU]");
    }
}