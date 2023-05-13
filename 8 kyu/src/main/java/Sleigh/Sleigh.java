package Sleigh;

class Sleigh {
    //Sleigh Authentication
    public static Boolean authenticate(String name, String password) {
        return name.equals("Santa Claus") && password.equals("Ho Ho Ho!");
    }
}
