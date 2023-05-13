package Ghost;

class Ghost {
    //Color Ghost
    private final String[] colors = new String[]{
            "white",
            "yellow",
            "purple",
            "red"
    };

    public String getColor() {
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }

}
