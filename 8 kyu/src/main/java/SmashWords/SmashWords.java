package SmashWords;

class SmashWords {

    public static String smash(String... words) {
        String str = " ";

        for (int i = 0; i < words.length; i++) {
            str += " " + words[i];
        }
        return str.trim();
        //return String.join(" ", words);
    }
}
