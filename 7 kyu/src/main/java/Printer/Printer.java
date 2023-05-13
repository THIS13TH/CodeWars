package Printer;

class Printer {

    public static String printerError(String s) {
        //Printer Errors
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}
