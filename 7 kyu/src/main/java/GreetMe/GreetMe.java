package GreetMe;

class GreetMe {
    public static String greet(String name) {
        //Greet Me
        return "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!";
    }
}
