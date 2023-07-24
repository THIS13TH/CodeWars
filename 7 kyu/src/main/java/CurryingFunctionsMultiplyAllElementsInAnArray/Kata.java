package CurryingFunctionsMultiplyAllElementsInAnArray;

import java.util.function.Function;

import static java.util.stream.IntStream.of;

public class Kata {
    public static Function<Integer,int[]> multiplyAll(int[] array) {
        return i -> of(array).map(a -> a*i).toArray();
    }
}
