package CodeWarsMath;

class CodeWarsMath {
    //Find Nearest square number
    public static int nearestSq(final int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}
