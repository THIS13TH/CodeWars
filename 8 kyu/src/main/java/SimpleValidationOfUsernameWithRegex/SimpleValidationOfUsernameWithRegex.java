package SimpleValidationOfUsernameWithRegex;

class SimpleValidationOfUsernameWithRegex {
    public static boolean validateUsr(String s) {
        //Simple validation of a username with regex
        return s.matches("[a-z0-9_]{4,16}");
    }
}
