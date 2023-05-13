package CodeWars;

import static java.util.Arrays.stream;

class CodeWars {
    public static long overTheRoad(long address, long n) {
        //Over The Road
        return (2 * n + 1) - address;
    }

    public static String oddOrEven(int[] array) {
        //Odd or Even?
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        if(sum % 2 == 0){
//            return "even";
//        }else{
//            return "odd";
//        }
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }

    public static String fireFight(String s) {
        //Holiday III - Fire on the boat
        return s.replaceAll("Fire", "~~");
    }
}
