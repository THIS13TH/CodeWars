package RemoveChars;

class RemoveChars {
    //Remove First and Last Character
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}
