package Vowels;

class Vowels {
    //Vowel Count
    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}
