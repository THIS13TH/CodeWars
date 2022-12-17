package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.sort;


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
//                Kata kata = new Kata();
//        System.out.println(Kata.countingSheep(3));
//        Cockroach cockroach = new Cockroach();
//        System.out.println(cockroach.cockroachSpeed(1.09));
//        Accumul accumul = new Accumul();
//        System.out.println(Accumul.accum("ZpglnRxqenU"));
//        System.out.println(Kata.rentalCarCost(10));
//        System.out.println(kata.quarterOf(3));
//        System.out.println(Kata.makeNegative(42));
//
//        Boolean[] array1 = {true,  true,  true,  false,
//                true,  true,  true,  true ,
//                true,  false, true,  false,
//                true,  false, false, true ,
//                true,  true,  true,  true ,
//                false, false, true,  true };
//        Counter counter = new Counter();
//        System.out.println(counter.countSheeps(array1));
//        CharProblem charProblem = new CharProblem();
//        System.out.println(CharProblem.howOld("5 years old"));
//        int[] test = new int[] {1, 2, 3};
//        Maps maps = new Maps();
//        int[] result = Maps.map(test);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        List<? extends Serializable> test = Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0");
//        MixedSum mixedSum = new MixedSum();
//        System.out.println(mixedSum.sum(test));
//        }
//        TrafficLights trafficLights = new TrafficLights();
//        System.out.println(TrafficLights.updateLight("red"));
//        BasicOperations basicOperations = new BasicOperations();
//        System.out.println(BasicOperations.basicMath("+", 4, 7));
//        Correct correct = new Correct();
//        System.out.println(Correct.correct("R1CHARD P. FEYNMAN - 5TAT15T1CAL MECHAN1C5"));
//        Sid sid = new Sid();
//        System.out.println(Sid.howMuchILoveYou(1));
//        System.out.println(Sid.howMuchILoveYou(2));
//        System.out.println(Sid.howMuchILoveYou(27));
//        SmallestIntegerFinder smallestIntegerFinder = new SmallestIntegerFinder();
//        int[] test = new int[]{78,56,232,12,11,43};
//        System.out.println(SmallestIntegerFinder.findSmallestInt(test));
//        Calculate calculate = new Calculate();
//        System.out.println(Calculate.bmi(80, 1.80));
//        CodeWars codeWars = new CodeWars();
//        System.out.println(CodeWars.strCount("Hello", 'l'));
//        System.out.println(CodeWars.strCount("",'z'));
//
//        Bio bio = new Bio();
//        System.out.println(bio.dnaToRna("TTTT"));
//        RemoveChars removeChars = new RemoveChars();
//        System.out.println(RemoveChars.remove("eloquent"));
        //Kata kata = new Kata();
//        System.out.println(kata.multiTable(5));
//System.out.println(Kata.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        Kata kata = new Kata();
        System.out.println(Kata.countBy(1, 10));
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

    public static int rentalCarCost(int d) {
        //Transportation on vacation
        int result = 0;
        for (int i = 0; i < d; i++) {
            result += 40;
        }
        if (d >= 3 && d < 7) {
            result -= 20;
        }
        if (d >= 7) {
            result -= 50;
        }
        return result;
        // return d < 7 ? d < 3 ? 40 * d : 40 * d - 20 : 40 * d - 50;
    }

    public static int quarterOf(int month) {
        //Quarter of the year
        return (month + 2) / 3;
//        int quarter = 0;
//        if (month >= 1 && month <= 3) {
//            quarter = 1;
//        } else if (month >= 4 && month <= 6) {
//            quarter = 2;
//        } else if (month >= 7 && month <= 9) {
//            quarter = 3;
//        } else if (month >= 10 && month <= 12) {
//            quarter = 4;
//        }
//        return quarter;
    }

    public static int makeNegative(final int x) {
        //Return Negative
        if (x < 0) {
            return x;
        }
        return x * -1;
    }

    static String greet(String name, String owner) {
        //Grasshopper - Personalized Message
        if (name.equals(owner)) {
            return "Hello boss";
        } else {
            return "Hello guest";
        }
    }

    public static String noSpace(final String x) {
        //Remove String Spaces
        return x.replaceAll(" ", "");
    }

    public static String switchItUp(int number) {
        //Switch it Up!
        String[] numbers =
                {"Zero", "One", "Two", "Three",
                        "Four", "Five", "Six",
                        "Seven", "Eight", "Nine"};

        return numbers[number];
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        //Volume of a Cuboid
        return length * width * height;
    }

    public int min(int[] list) {
        //Find Maximum and Minimum Values of a List

//        int min = list[0];
//        for (int i = 0; i < list.length; i++) {
//            if(min > list[i]){
//                min = list[i];
//            }
//        }
//        return min;
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        //Find Maximum and Minimum Values of a List

//        int max = list[0];
//        for (int i = 0; i < list.length; i++) {
//            if(max < list[i]){
//                max = list[i];
//            }
//        }
//        return max;
        return Arrays.stream(list).max().getAsInt();
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        //Count of positives / sum of negatives
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int contPostive = 0;
        int sumNegative = 0;
        for (int count : input) {
            if (count > 0) {
                contPostive++;
            }
        }
        for (int negative : input) {
            if (negative < 0) {
                sumNegative += negative;
            }
        }
        return new int[]{contPostive, sumNegative};
    }

    public static int[] between(int a, int b) {
        //What is between?
        int length = 0;
        for (int k = a; k <= b; k++) {
            length++;
        }

        int[] array = new int[length];
        int first = a;

        for (int i = 0; i < length; i++) {
            array[i] = first;
            first++;

        }
        return array;
    }

    public static String multiTable(int num) {
        String res = "";
        for (int i = 1; i <= 10; i++) {
            res += (i + " * " + num + " = " + num * i);
            if (i < 10) {
                res += "\n";
            }

        }
        return res;
    }

    public static int hexToDec(final String hexString) {
        // Hex to Decimal
        return Integer.parseInt(hexString, 16);
    }

    public static String greet(String name) {
        //Returning Strings
        return String.format("Hello, %s how are you doing today?", name);
    }

    public static String position(char alphabet) {
        //Find the position!
        String line = "abcdefghijklmnopqrstuvwxyz";

        int position = line.indexOf(String.valueOf(alphabet).toLowerCase()) + 1;
        return "Position of alphabet: " + String.valueOf(position);
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        //How good are you really
        int point = 0;
        for (int i = 0; i < classPoints.length; i++) {
            point += classPoints[i];
        }
        int res = point / classPoints.length;
        return yourPoints > res;
    }

    public static int grow(int[] x) {
        //Beginner - Reduce but Grow
        int res = 1;
        for (int i : x) {
            res *= i;
        }
        return res;
    }

    public static int[] getSize(int w, int h, int d) {
        //Surface Area and Volume of a Box
        return new int[]{2 * (w * h + h * d + d * w), w * h * d};
    }

    public static int opposite(int number)
    //Opposite number
    {
        return -number;
    }

    public static int[] digitize(long n) {
        // Convert number to reversed array of digits
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    public static String rps(String p1, String p2) {
        //Rock Paper Scissors!
        if (p1 == p2) {
            return "Draw!";
        }
        if (p1 == "rock" && p2 == "scissors") {
            return "Player 1 won!";
        } else if (p1 == "paper" && p2 == "rock") {
            return "Player 1 won!";
        } else if (p1 == "scissors" && p2 == "paper") {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }

    public static int[] countBy(int x, int n) {
        //Count by X
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] += x * (1 + i);
        }
        return result;
    }

    public static long stairsIn20(int[][] stairs) {
        //How many stairs will Suzuki climb in 20 years?
        long sum = 0;
        long sum_20 = 0;
        for (int[] day : stairs) {
            for (int num : day) {
                sum = sum + num;
            }
        }
        sum_20 = sum * 20;
        return sum_20;
    }

    public static int sum(int[] numbers) {
        //Sum without highest and lowest number
        if (numbers == null || numbers.length < 3) return 0;

        sort(numbers);

        int sum = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static long sumMul(int n, int m) {
        //Sum of Multiples
        int sum = 0;
        if (n > 0 && m > 0) {
            for (int i = n; i < m; i += n) {
                if (i % n == 0) {
                    sum += i;
                }
            }
            return sum;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int[] pipeFix(int[] numbers) {
        //Lario and Muigi Pipe Problem
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int size = max - min + 1;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = i + min;
        }
        return result;
    }

    public static int toBinary(int n) {
        //Convert to Binary
        return Integer.parseInt(Integer.toBinaryString(n));
    }

    public static int oddCount(int n){
        //Count Odd Numbers below n
        return n / 2;
    }

    public static int nthPower(int[] array, int n) {
        //N-th Power
        return array.length - 1 < n ? -1 : (int) Math.pow(array[n], n);
    }

    public static int findLongest(final String str) {
        //Squash the bugs (retired)
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }

        }
        return longest;
    }

    public static String datingRange(int age) {
        //Age Range Compatibility Equation
        if (age < 14) {
            return String.format(
                    "%d-%d",
                    (int) (age - 0.10 * age),
                    (int) (age + 0.10 * age)
            );
        }
        return String.format(
                "%s-%s",
                age / 2 + 7,
                (age - 7) * 2
        );
    }

    public static String stringy(int size) {
        //Stringy Strings
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++){
            if (i % 2 ==0) {
                builder.append(1);
            } else {
                builder.append(0);
            }
        }
        return builder.toString();
    }

    public static String shortcut(String input) {
        //Vowel remover
        return input.replaceAll("[AaEeIiOoUu]", "");
    }

    public static boolean feast(String beast, String dish) {
        //The Feast of Many Beasts
        char b1 = beast.charAt(0);
        char d1 = dish.charAt(0);
        char b2 = beast.charAt(beast.length() - 1);
        char d2 = dish.charAt(dish.length() - 1);

        return b1 == d1 && b2 == d2;
    }

    public static String leo(final int oscar)
    {
        //Leonardo Dicaprio and Oscars
        switch (oscar) {
            case 86:
                return "Not even for Wolf of wallstreet?!";
            case 88:
                return "Leo finally won the oscar! Leo is happy";
            default:
                return oscar < 88 ? "When will you give Leo an Oscar?" : "Leo got one already!";
        }
    }

    public static String remove(String s, int n){
        //Exclamation marks series #6: Remove n exclamation marks in the sentence from left to right
        for(int i = 0; i < n;i++)
            s = s.replaceFirst("!","");
        return s;

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

    static String removeExclamationMarks(String s) {
        //Remove exclamation marks
        return s.replace("!", "");
    }

    public static boolean check(Object[] a, Object x) {
        //You only need one - Beginner
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                return true;
            }
        }
        return false;
    }

    public static int areaOrPerimeter(int l, int w) {
        //Area or Perimeter
        if (l == w) {
            return l * l;
        } else {
            return (l + w) * 2;
        }
    }

    public static String[] stringToArray(String s) {
        //Convert a string to an array;
        return s.split(" ");
    }

    public static int century(int number) {
        //Century From Year
        return (number + 99) / 100;
    }


    public static int addFive(int num) {
        //Grasshopper - Basic Function Fixer
        return num + 5;
    }

    public static String doubleChar(String s){
        //Double Char
        return s.replaceAll(".", "$0$0");
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
            sort(arr);
        }
        return new int[]{arr[0], arr[arr.length - 1]};
    }
}

class Cockroach {
    //Beginner Series #4 Cockroach
    public int cockroachSpeed(double x) {
        return (int) Math.floor(x * 27.7777777777778);
    }
}

class Accumul {
    //Mumbling
    public static String accum(String s) {
        String result = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            result += '-' + String.valueOf(s.charAt(i)).toUpperCase() + String.valueOf(s.charAt(i)).repeat(i).toLowerCase();
        }
        return result.substring(1);
    }
}

class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        //Counting sheep
        int sheeps = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == null) {
                sheeps += 0;
            } else if (arrayOfSheeps[i] == true) {
                sheeps += 1;
            }
        }
        return sheeps;
    }
}

class CharProblem {
    public static int howOld(final String herOld) {
        //Parse nice int from char problem
        return Character.getNumericValue(herOld.charAt(0));
        //return Integer.parseInt(herOld.substring(0, 1));

    }
}

class Maps {
    public static int[] map(int[] arr) {
        //Beginner - Lost Without a Map
//        int[] result = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            result[i] = arr[i] * 2;
//        }
//        return result;
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
}

class MixedSum {
    //Sum Mixed Array
    public int sum(List<?> mixed) {
        Object[] arr = mixed.toArray();
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += Integer.parseInt(arr[i].toString());
        }
        return result;
    }
}

class TrafficLights {

    public static String updateLight(String current) {
        //Thinkful - Logic Drills: Traffic light
        String newLight = "";

        if (current.equals("green")) {
            newLight = "yellow";
        } else if (current.equals("red")) {
            newLight = "green";
        } else if (current.equals("yellow")) {
            newLight = "red";
        }

        return newLight;
    }
}

class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        //Basic Mathematical Operations
        if (op.equals("+")) {
            return v1 + v2;
        } else if (op.equals("-")) {
            return v1 - v2;
        } else if (op.equals("*")) {
            return v1 * v2;
        } else if (op.equals("/")) {
            return v1 / v2;
        }
        return null;
    }
}

class Correct {
    //Correct the mistakes of the character recognition software
    public static String correct(String string) {
//        String str = string.replaceAll("5", "S");
//        String str2 = str.replaceAll("1", "I");
//        String str3 = str2.replaceAll("0", "O");
//        return str3;
        return string.replace("5", "S").replace("0", "O").replace("1", "I");
    }
}

class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        //I love you, a little , a lot, passionately ... not at all
        String[] arr = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        return arr[(nb_petals - 1) % 6];
    }

    public static int simpleMultiplication(int n) {
        //Simple multiplication
        return n % 2 == 0 ? n * 8 : n * 9;
    }
}

class Positive {
    //Sum of positive
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

}

class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        //Find the smallest integer in the array
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;
    }
}

class HelpAlex {
    public static String hoopCount(int n) {
        //Keep up the hoop
        if (n >= 10) {
            return "Great, now move on to tricks";
        } else {
            return "Keep at it until you get it";
        }
    }
}

class Calculate {
    public static String bmi(double weight, double height) {
        //Calculate BMI
        double bmi = weight / Math.pow(height, 2);
        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 25.0) {
            return "Normal";
        } else if (bmi <= 30.0) {
            return "Overweight";
        } else if (bmi > 30) {
            return "Obese";
        }
        return null;
    }
}

class CodeWars {
    public static int strCount(String str, char letter) {
        //All Star Code Challenge #18
        char[] array = str.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == letter) {
                count += 1;
            } else if (array[i] == letter) {
                return 0;
            }

        }
        return count;
    }
}

class Bio {
    public String dnaToRna(String dna) {
        //DNA to RNA Conversion
        dna = dna.replace('T', 'U');
        return dna;  // Do your magic!
    }
}

class RemoveChars {
    //Remove First and Last Character
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}

class EvenOrOdd {
    public static String even_or_odd(int number) {
        //Even or Odd
        return number % 2 == 0 ? "Even" : "Odd";
    }
}

class Ascii {
    //get character from ASCII Value
    public static char getChar(int c) {
        return (char) c;
    }
}

class HelloWorld {
    //Function 1 - hello world
    public static String greet() {
        return "hello world!";
    }
}

class Converter {
    public static int binToDecimal(String inp) {
        return Integer.parseInt(inp, 2);

    }
}

class Move {
    public static int move(int position, int roll) {
        // Grasshopper - Terminal game move function
        return position + (roll * 2);
    }
}

class Upper {
    public static String MakeUpperCase(String str) {
        //MakeUpperCase
        return str.toUpperCase();
    }
}

class ThirdAngle {
    public static int otherAngle(int angle1, int angle2) {
        //Third Angle of a Triangle
        return 180 - (angle1 + angle2);
    }
}

class SortAndStar {
    //Sort and Star
    public static String twoSort(String[] s) {
        sort(s);
        return String.join("***", s[0].split(""));

    }
}

class NoBoring {
    public static int noBoringZeros(int n) {
        //No zeros for heros
        return n == 0 || n % 10 != 0 ? n : noBoringZeros(n / 10);
//        if (n == 0)
//            return n;
//
//        while (n % 10 == 0)
//            n /= 10;
//
//        return n;
    }
}

class FakeBinary {
    //Fake Binary
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
//    char[] c = numberString.toCharArray();
//        for (int i = 0; i < c.length; i++)
//    {
//        if ((c[i] - '0') < 5)
//            c[i] = '0';
//        else
//            c[i] = '1';
//    }
//        return new String(c);
}

class Minimum {
    //Form The Minimum
    public static int minValue(int[] values) {
        List<Integer> array = new ArrayList<>();
        for (int n : values) {
            array.add(n);
        }
        var res = array.stream().distinct().sorted().map(x -> String.valueOf(x));
        return Integer.parseInt(res.collect(Collectors.joining()));
    }
}

class FirstNonConsecutive {
    //Find the first non-consecutive number
    static Integer find(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] != array[i] + 1)
                return array[i + 1];
        }
        return null;
    }
}

class Goals {
    //Grasshopper - Messi goals function
    public static int goals(int... array) {
        return Arrays.stream(array).sum();
    }
//public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
//       return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
//      }
}

class SumArray {
    //Sum Arrays
    public static double sum(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}

class TwiceAsOld {
    //Twice as old
    public static int TwiceAsOld(int dadYears, int sonYears) {
        int twice = dadYears - sonYears * 2;
        return twice < 0 ? twice * (-1) : twice;

    }
}

class XOR {
    //Exclusive "or" (xor) Logical Operator
    public static boolean xor(boolean a, boolean b) {
        //your code here:
        return a != b;
    }
}

class ArrayPrinter {
    //Printing Array elements with Comma delimiters
    public static String printArray(Object[] array) {
        String[] str = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            str[i] = String.valueOf(array[i]);
        }
        return String.join(",", str);
    }
}

class Goals2 {
    //Grasshopper - Messi Goals
    public static int laLigaGoals = 43;
    public static int championsLeagueGoals = 10;
    public static int copaDelReyGoals = 5;

    public static int totalGoals = laLigaGoals + championsLeagueGoals + copaDelReyGoals;
}

class Hello {
    public String sayHello(String[] name, String city, String state) {
        //Welcome to the City
        return String.format(
                "Hello, %s! Welcome to %s, %s!",
                String.join(" ", name),
                city,
                state);
    }
}

class KeepHydrated {
    //Keep Hydrated!
    public int Liters(double time) {
        return (int) (time / 2);
    }

}

class DayOfWeek {
    //Return the day
    public static String getDay(int n) {
        switch (n) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Wrong, please enter a number between 1 and 7";
        }
    }
}

class GrassHopperArrayMean {
    //Grasshopper - Array Mean
    public static int findAverage(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result / nums.length;
    }
}

class CuboidVolumes {
    //Difference of Volumes of Cuboids
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int volumesFirstCuboid = 1;
        int volumesSecondCuboid = 1;

        for (int i = 0; i < 3; i++) {
            volumesFirstCuboid *= firstCuboid[i];
            volumesSecondCuboid *= secondCuboid[i];
        }

        if (volumesFirstCuboid > volumesSecondCuboid) return volumesFirstCuboid - volumesSecondCuboid;
        else {
            return volumesSecondCuboid - volumesFirstCuboid;
        }
    }
}

class Vowels {
    //Vowel Count
    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}

class MonkeyCounter
{
    public static int[] monkeyCount(final int n){
        //Count the Monkeys!
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}

class YesOrNo
{
    //Convert boolean values to strings 'Yes' or 'No'.
    public static String boolToWord(boolean b)
    {
        return b == true ? "Yes" : "No";
    }
}

class CodeWarsMath {
    //Find Nearest square number
    public static int nearestSq(final int n){
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}

class DivisibleNb {
    //Is n divisible by x and y?
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}

class GhostCode{
    //Ghost code?!
    public static String helloName(final String name){
        if (name == null || name.equals("")) {
            return "Hello world!";
        } else {
            return "Hello my name is " + name;
        }
    }
}

class Swapper{
    //Swap Values
    public Object[] arguments;

    public Swapper(final Object[] arguments){
        this.arguments = arguments;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        arguments[0] = args[1];
        arguments[1] = temp;
    }
}

class NameMe {
    //"this" is a problem
    public String firstName;
    public String lastName;
    public String fullName;

    public NameMe(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.fullName = String.format("%s %s", firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }
}

class MyUtilities{

    public boolean isDigit(String s)
    {
        //Is it a number?
        return s.matches("^-?[0-9]{1,12}(?:\\.[0-9]{1,100})?$");
    }
}

class Alarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        //L1: Set Alarm
        return employed && !vacation;
    }
}

class SumArrayPlusArray {
    //Array plus array
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }

}

class Ghost {
    //Color Ghost
    private final String[] colors = new String[]{
            "white",
            "yellow",
            "purple",
            "red"
    };

    public String getColor() {
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }

}

class EvenNumbers {
    //Find numbers which are divisible by given number
    public static int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int number : numbers){
            if (number % divider == 0){
                count ++;
            }
        }
        int[] arr = new int[count];
        int i = 0;
        for (int number : numbers){
            if (number % divider == 0){
                arr[i] = number;
                i++;
            }
        }
        return arr;
    }
}

class BooleanToString {
    //Convert a Boolean to a String
    public static String convert(boolean b){
        return b ? "true" : "false";
    }

}

class Plural{
    public static boolean isPlural(float f) {
        //Plural
        return (f != 1 );
    }
}

class Dinglemouse {
    public static String replaceDots(final String str) {
        //Replace all dots
        return str.replaceAll("\\.", "-");
    }
}

class Numbers
{
    public static double TwoDecimalPlaces(double number)
    {
        //Formatting decimal places #0
        return Double.parseDouble(String.format("%.2f", number));
    }
}

class HowDoICompare {
    //How do I compare numbers?
    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0].equals(x)) {
                return (String) p[1];
            }
        }
        return "nothing";
    }

    static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"},
    };
}

class WideMouthedFrog{
    //The Wide-Mouthed frog!
    public static String mouthSize(String animal){
        return animal.equalsIgnoreCase("alligator") ? "small" : "wide";
    }
}

class GrassHopperDebugsayHello {
    //Grasshopper - Debug sayHello
    public static String sayHello(String name) {
        return String.format("Hello, %s", name);
    }
}

class Number {
    //Is it even?
    public boolean isEven(double n) {
        return n % 2 == 0;
    }
}

class StringUtils {
    //altERnaTIng cAsE <=> ALTerNAtiNG CaSe
    public static String toAlternativeString(String string) {
        char[] arr = string.toCharArray();
        for(int i = 0;i<arr.length;i++) {
            if (Character.isAlphabetic(arr[i])) {
                if (Character.isUpperCase(arr[i])) {
                    arr[i] = Character.toLowerCase(arr[i]);
                } else {
                    arr[i] = Character.toUpperCase(arr[i]);
                }
            }
        }
        return new String(arr);
    }
}

class Greeter {
    //Jenny's secret message
    public static String greet(String name) {
        return name.equals("Johnny")
                ? "Hello, my love!"
                : String.format("Hello, %s!", name);
    }
}

class ZywOo {

    public static int[] multipleOfIndex(int[] array) {
        //Multiple of index
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                temp.add(array[i]);
            }
        }
        int[] done = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            done[i] = temp.get(i);
        }
        return done;
    }

    public static int sumOfDifferences(int[] arr) {
        //Sum of differences in array
        if (arr.length < 2) return 0;
        int max = arr[0], min = max;
        for (int a : arr) if (a > max) max = a;
        else if (a < min) min = a;
        return max - min;
    }
}

class SimpleValidationOfUsernameWithRegex {
    public static boolean validateUsr(String s) {
        //Simple validation of a username with regex
        return s.matches("[a-z0-9_]{4,16}");
    }
}

class Dinglemouse2 {
    //Cat years, Dog years

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        return new int[] {humanYears, humanYears > 1 ? 16 + 4 * humanYears : 15, humanYears > 1 ? 14 + 5 * humanYears : 15};
    }

}

class Clock {
    //Beginner Series #2 Clock
    public static int Past(int h, int m, int s) {
        return (h * 3600 + m * 60 + s) * 1000;
    }
}

class GrassHopperGradeBook {
    //Grasshopper - Grade book
    public static char getGrade(int s1, int s2, int s3) {
        s1=(s1+s2+s3)/3;
        return s1 >= 90 ? 'A': s1 >= 80 ? 'B': s1 >= 70 ? 'C': s1 >= 60 ? 'D': 'F';
    }
}

class TipCalculator {
    //Tip Calculator
    public static Integer calculateTip(double amount, String rating) {
        String rate = rating.toLowerCase();
        System.out.println(rate+" "+amount);
        switch(rate){
            case "terrible":
                return (int) Math.ceil(amount*0/100);
            case "poor":
                return (int) Math.ceil(amount*5/100);
            case "good":
                return (int) Math.ceil(amount*10/100);
            case "great":
                return (int) Math.ceil(amount*15/100);
            case "excellent":
                return (int) Math.ceil(amount*20/100);
            default:
                return null;

        }
    }
}

class Java {
    //You Can't Code Under Pressure #1
    public static int doubleInteger(int i) {
        return i*2;
    }
}

class Nessie {
    //A Strange Trip to the Market
    public static boolean isLockNessMonster(String s){
        return s.contains("tree fiddy") || s.contains("3.50");
    }
}

class Geometry{
    //Area of a Square
    public static double squareArea(double A){
        double l = (2*A)/Math.PI;
        double x = l*l;
        double y = Math.round(x * 100) * 0.01d;
        return y;
    }
}