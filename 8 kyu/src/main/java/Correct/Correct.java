package Correct;

class Correct {
    //Correct the mistakes of the character recognition software
    public static String correct(String string) {
//        String str = string.replaceAll("5", "S");
//        String str2 = str.replaceAll("1", "I");
//        String str3 = str2.replaceAll("0", "O");
//        return str3;
        return string.replace("5", "S").replace("0", "O").replace("1", "I");
    }
}
