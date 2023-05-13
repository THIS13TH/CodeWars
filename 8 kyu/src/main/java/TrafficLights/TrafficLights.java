package TrafficLights;

class TrafficLights {

    public static String updateLight(String current) {
        //Thinkful - Logic Drills: Traffic light
        String newLight = "";

        if (current.equals("green")) {
            newLight = "yellow";
        } else if (current.equals("red")) {
            newLight = "green";
        } else if (current.equals("yellow")) {
            newLight = "red";
        }

        return newLight;
    }
}
