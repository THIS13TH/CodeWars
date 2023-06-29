package CountСonsonants;

public class Consonants {
    public static int getCount(String str) {
        String vowels = "aeiou";
        int counVow = 0;
        int charCount = 0;
        int simbol = 0;

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1)
                counVow++;
            if(Character.isLetter(str.charAt(i))){
                charCount++;
            }
            if(str.matches("\\W")){
                simbol++;
            }
        }

        return  (charCount - counVow) + simbol;
        //return str.replaceAll("[^A-Za-z]|[AEIOUaeiou]", "").length();v
    }
}
