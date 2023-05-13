package AbbreviateTwoWords;

class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String firstLetters = "";

        name = name.replaceAll("[.]", ""); // Replace dots, etc (optional)
        for (String s : name.split(" ")) {
            firstLetters += s.charAt(0);
        }
        return firstLetters.substring(0, 1).toUpperCase() + "." + firstLetters.substring(1).toUpperCase();
    }
}
