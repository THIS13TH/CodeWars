package Goals;

import static java.util.Arrays.stream;

class Goals {
    //Grasshopper - Messi goals function
    public static int goals(int... array) {
        return stream(array).sum();
    }
        //public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
//       return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
//      }


}
