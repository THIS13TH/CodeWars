package GhostCode;

class GhostCode {
    //Ghost code?!
    public static String helloName(final String name) {
        if (name == null || name.equals("")) {
            return "Hello world!";
        } else {
            return "Hello my name is " + name;
        }
    }
}
