package Exercise;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        MinMax minMax = new MinMax();
//        Sum s = new Sum();
//        Kata reversestring = new Kata();
//        StringToNumber stringToNumber = new StringToNumber();
//        AbbreviateTwoWords abbreviateTwoWords = new AbbreviateTwoWords();
//        Solution solution = new Solution();
//        GrassHopper grassHopper = new GrassHopper();
//        Sequence sequence = new Sequence();
//        OppositesAttract oppositesAttract = new OppositesAttract();


//        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};

//        System.out.println(s.GetSum(0, -1));
//        System.out.println(s.GetSum(0, 1));
//        System.out.println(RowSumOddNumbers.rowSumOddNumbers(42));
//
//        System.out.println(Kata.solution("world"));
//        System.out.println(StringToNumber.stringToNumber("1234"));
//        System.out.println(Kata.numberToString(67));
//        System.out.println(AbbreviateTwoWords.abbrevName("Sam Harris"));
//        System.out.println(Kata.highAndLow("1 2 -3 4 5"));
//        System.out.println(Kata.findNeedle(haystack3));
//        System.out.println(Solution.repeatStr(3, "Hello"));
//        System.out.println(Kata.squareSum(new int[] {1,2,2}));
//        System.out.println(SmashWords.smash(new String[] { "Bilal", "Djaghout" }));
//        System.out.println(GrassHopper.summation(8));
//        int[] test = Sequence.reverse(5);
//        for (int i = 0; i < test.length; i++) {
//            System.out.println(test[i]);
//        }

//        System.out.println(OppositesAttract.isLove(1, 4));
//        System.out.println(OppositesAttract.isLove(2, 2));
//        System.out.println(OppositesAttract.isLove(1, 1));
//        System.out.println(OppositesAttract.isLove(0, 1));
//        System.out.println(Kata.find_average(new int[]{1, 2, 3}));
//        int[] test = MinMax.minMax(new int[]{2334454,5});
//
//        for (int i = 0; i < test.length; i++) {
//            System.out.println(test[i]);
//        }
//        Kata kata = new Kata();
//        System.out.println(Kata.countingSheep(3));
        Cockroach cockroach = new Cockroach();
        System.out.println(cockroach.cockroachSpeed(1.09));
    }
}


class Sum {
    public int GetSum(int a, int b) {
        int sum = 0;
        if (a == b) {
            return a;
        }
        if (b > a) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }

        return sum;
    }
}

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        return (int) Math.pow(n, 3);
    }
}

class Kata {
    //Reversed Strings
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //Convert a Number to a String!
    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    //Highest and Lowest
    public static String highAndLow(String numbers) {
        String strArr[] = numbers.split(" ");

        int numArr[] = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        int min = numArr[0];
        for (int i = 0; i < numArr.length; i++) {
            if (min > numArr[i]) {
                min = numArr[i];
            }
        }

        int max = numArr[0];
        for (int i = 0; i < numArr.length; i++) {
            if (max < numArr[i]) {
                max = numArr[i];
            }
        }
        return String.valueOf(max) + " " + String.valueOf(min);
    }

    public static String findNeedle(Object[] haystack) {
        int index = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                index = i;
            }
        }
        return "found the needle at position " + index;
    }

    public static int squareSum(int[] n) {
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            result += Math.pow(n[i], 2);
        }
        return result;
    }

    public static double find_average(int[] array) {
        double average = 0;
        if (array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average / array.length;
    }

    public static int[] invert(int[] array) {
        if (array.length == 0) {
            return new int[]{0};
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * -1;
        }
        return array;
    }

    public static String countingSheep(int num) {
        //Add your code here
        String res = "";
        String sheep = "sheep...";
        for (int i = 1; i <= num; i++) {
            res += i + " " + sheep;
        }
        return res;
    }
}

class StringToNumber {
    //Convert a String to a Number!
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}

class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String firstLetters = "";

        name = name.replaceAll("[.]", ""); // Replace dots, etc (optional)
        for (String s : name.split(" ")) {
            firstLetters += s.charAt(0);
        }
        return firstLetters.substring(0, 1).toUpperCase() + "." + firstLetters.substring(1).toUpperCase();
    }
}

class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += string;
        }
        return result;
    }
}

class SmashWords {

    public static String smash(String... words) {
        String str = " ";

        for (int i = 0; i < words.length; i++) {
            str += " " + words[i];
        }
        return str.trim();
        //return String.join(" ", words);
    }
}

class GrassHopper {
    //Grasshopper - Summation
    public static int summation(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

class Sequence {
    //Reversed sequence
    public static int[] reverse(int n) {
        int[] result = new int[n];
//        for (int i = 0; i <= n - 1 ; i++){
//            result[i] = i + 1 ;
//        }

//        int[] reverseResult = new int[result.length];
//        for (int i = 0; i < result.length; i++) {
//            reverseResult[result.length - 1 -i] = result[i];
//        }
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }
        return result;

    }

}

class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        boolean isLove;
        if (flower2 % 2 == 1 && flower1 % 2 == 0 || flower1 % 2 == 1 && flower2 % 2 == 0) {
            isLove = true;
        } else {
            isLove = false;
        }
        return isLove;
    }

}

class MinMax {
    public static int[] minMax(int[] arr) {
        //The highest profit wins!
        if (arr.length == 1) {
            return new int[]{arr[0], arr[0]};
        } else {
            Arrays.sort(arr);
        }
        return new int[]{arr[0], arr[arr.length - 1]};
    }
}

class Cockroach{
    //Beginner Series #4 Cockroach
    public int cockroachSpeed(double x){
        return (int) Math.floor(x * 27.7777777777778);
    }
}