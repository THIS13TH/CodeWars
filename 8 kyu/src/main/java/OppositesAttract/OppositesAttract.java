package OppositesAttract;

class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        boolean isLove;
        if (flower2 % 2 == 1 && flower1 % 2 == 0 || flower1 % 2 == 1 && flower2 % 2 == 0) {
            isLove = true;
        } else {
            isLove = false;
        }
        return isLove;
    }

}
