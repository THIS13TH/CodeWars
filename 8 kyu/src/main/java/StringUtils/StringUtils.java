package StringUtils;

class StringUtils {
    //altERnaTIng cAsE <=> ALTerNAtiNG CaSe
    public static String toAlternativeString(String string) {
        char[] arr = string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isAlphabetic(arr[i])) {
                if (Character.isUpperCase(arr[i])) {
                    arr[i] = Character.toLowerCase(arr[i]);
                } else {
                    arr[i] = Character.toUpperCase(arr[i]);
                }
            }
        }
        return new String(arr);
    }


    public static boolean isDigit(String s) {
        //Regexp Basics - is it a digit?
        return s.matches("[0-9]");
    }
}
