package Minimum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

class Minimum {
    //Form The Minimum
    public static int minValue(int[] values) {
        List<Integer> array = new ArrayList<>();
        for (int n : values) {
            array.add(n);
        }
        var res = array.stream().distinct().sorted().map(x -> String.valueOf(x));
        return parseInt(res.collect(Collectors.joining()));
    }
}
