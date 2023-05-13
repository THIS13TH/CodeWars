package MyUtilities;

class MyUtilities {

    public boolean isDigit(String s) {
        //Is it a number?
        return s.matches("^-?[0-9]{1,12}(?:\\.[0-9]{1,100})?$");
    }
}
