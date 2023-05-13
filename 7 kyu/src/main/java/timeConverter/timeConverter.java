package timeConverter;

class timeConverter {
    //All Star Code Challenge #22
    public static String toTime(int seconds) {
        return String.format("%d hour(s) and %d minute(s)", seconds / 3600, seconds % 3600 / 60);
    }
}
