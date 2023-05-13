package Greeter;

class Greeter {
    //Jenny's secret message
    public static String greet(String name) {
        return name.equals("Johnny")
                ? "Hello, my love!"
                : String.format("Hello, %s!", name);
    }
}
