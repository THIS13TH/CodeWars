package Movie;

class Movie {
    public static int movie(int card, int ticket, double perc) {
        //Going to the cinema
        double systemA = 0;
        double systemB = card;
        double tempTicket = ticket;
        int numberOfVisits = 0;
        do {
            systemA += ticket;
            tempTicket *= perc;
            systemB += tempTicket;
            numberOfVisits++;
        } while (systemA <= Math.ceil(systemB));

        return numberOfVisits;
    }
}
