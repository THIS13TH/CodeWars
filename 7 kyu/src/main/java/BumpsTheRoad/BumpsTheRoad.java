package BumpsTheRoad;

class BumpsTheRoad {
    public static String bumps(final String road) {
        //Bumps in the Road
        return road.replace("_", "").length() > 15 ? "Car Dead" : "Woohoo!";
    }
}
