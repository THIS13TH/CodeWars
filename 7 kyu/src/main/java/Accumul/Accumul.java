package Accumul;

class Accumul {
    //Mumbling
    public static String accum(String s) {
        String result = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            result += '-' + String.valueOf(s.charAt(i)).toUpperCase() + String.valueOf(s.charAt(i)).repeat(i).toLowerCase();
        }
        return result.substring(1);
    }
}
