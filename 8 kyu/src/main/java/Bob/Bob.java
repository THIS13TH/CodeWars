package Bob;

class Bob {
    //Will there be enough space?
    public static int enough(int cap, int on, int wait) {
        return Math.max(0, on + wait - cap);
    }
}
