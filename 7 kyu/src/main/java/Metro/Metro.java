package Metro;

import java.util.ArrayList;

class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        //Number of People in the Bus
        int result = 0;
        for (int i = 0; i < stops.size(); i++) {
            result += stops.get(i)[0];
            result -= stops.get(i)[1];
        }
        return result;
    }
}
