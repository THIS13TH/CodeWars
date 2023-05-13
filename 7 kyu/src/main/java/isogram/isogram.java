package isogram;

class isogram {
    public static boolean isIsogram(String str) {
        //Isograms
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)
            if (str.substring(i + 1).contains(str.charAt(i) + ""))
                return false;
        return true;
    }
}
