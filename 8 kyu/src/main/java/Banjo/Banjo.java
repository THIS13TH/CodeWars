package Banjo;

class Banjo {

    public static String areYouPlayingBanjo(String name) {
        //Are You Playing Banjo?
        if (name.charAt(0) == 'R' || name.charAt(0) == 'r') {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }

    }
}
