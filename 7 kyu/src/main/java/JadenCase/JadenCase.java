package JadenCase;

class JadenCase {

    public static String toJadenCase(String phrase) {
        //Jaden Casing Strings
        if (phrase == null || phrase.equals("")) {
            return null;
        }
        String[] str = phrase.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : str) {
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1);
            result.append(first).append(all).append(" ");
        }
        return result.toString().trim();
    }
}
