package Generator;

class Generator {
    public static String nickname(String name) {
        //Nickname Generator
        final String AEIOU = "aeiou";

        if (name.length() < 4) {
            return "Error: Name too short";
        }
        return AEIOU.indexOf(name.charAt(2)) != -1 ?
                name.substring(0, 4) : name.substring(0, 3);
    }
}
