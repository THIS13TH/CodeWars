package Ship;

class Ship {
    //OOP: Object Oriented Piracy
    private final double draft;
    private final int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    boolean isWorthIt() {
        return draft - 1.5 * crew > 20;
    }
}
