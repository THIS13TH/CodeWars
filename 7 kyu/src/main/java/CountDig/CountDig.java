package CountDig;

import java.util.stream.IntStream;

class CountDig {

    public static int nbDig(int n, int d) {
        //Count the Digit
        return (int) IntStream
                .rangeClosed(0, n)
                .map(i -> i * i)
                .flatMap(i -> String.valueOf(i).chars())
                .mapToObj(i -> (char) i)
                .mapToInt(Character::getNumericValue)
                .filter(i -> i == d)
                .count();
    }
}
