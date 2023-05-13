package BeadsCounter;

class BeadsCounter {
    //Simple beads count
    public static int countRedBeads(final int nBlue) {
        return (nBlue < 2) ? 0 : (nBlue - 1) * 2;
    }
}
