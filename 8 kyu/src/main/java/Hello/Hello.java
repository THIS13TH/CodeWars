package Hello;

class Hello {
    public String sayHello(String[] name, String city, String state) {
        //Welcome to the City
        return String.format(
                "Hello, %s! Welcome to %s, %s!",
                String.join(" ", name),
                city,
                state);
    }
}
