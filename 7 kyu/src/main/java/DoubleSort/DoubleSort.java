package DoubleSort;

import java.util.stream.Stream;

class DoubleSort {
    public static Object[] dbSort(Object[] a) {
        //Double Sort
        var numbers = Stream.of(a).filter(Integer.class::isInstance).sorted();
        var strings = Stream.of(a).filter(String.class::isInstance).sorted();
        return Stream.concat(numbers, strings).toArray();
    }
}
