package Spacify;

class Spacify {
    public static String spacify(String str) {
        //Spacify!
//        String test = "";
//        char[] result = str.toCharArray();
//        for (int i = 0; i < result.length ; i++) {
//            test += result[i];
//            test += " ";
//        }
//        return test.trim();
        return str.replaceAll("", " ").trim();
    }
}
