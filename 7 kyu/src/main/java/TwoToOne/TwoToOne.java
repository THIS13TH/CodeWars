package TwoToOne;

import java.util.stream.Collectors;

class TwoToOne {

    public static String longest(String s1, String s2) {
        //Two to One
        return (s1 + s2)
                .chars()
                .sorted()
                .distinct()
                .mapToObj(value -> String.valueOf((char) value))
                .collect(Collectors.joining());
    }
}
