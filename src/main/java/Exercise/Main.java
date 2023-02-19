package Exercise;


import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.sort;
import static java.util.Arrays.stream;
import static java.util.stream.IntStream.rangeClosed;


public class Main {
    public static void main(String[] args) {

        System.out.println(JadenCase.toJadenCase("most trees are blue"));

    }
}


class Player {
    final String name;

    Player(String name) {
        this.name = name;
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
        return stream(list).min().getAsInt();
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
        return stream(list).max().getAsInt();
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

    public static int oddCount(int n) {
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
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
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

    public static String leo(final int oscar) {
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

    public static String remove(String s, int n) {
        //Exclamation marks series #6: Remove n exclamation marks in the sentence from left to right
        for (int i = 0; i < n; i++)
            s = s.replaceFirst("!", "");
        return s;

    }

    public static int square(int n) {
        //Function 2 - squaring an argument
        return (int) Math.pow(n, 2);
    }

    public static String duckDuckGoose(Player[] players, int goose) {
        int result = goose % players.length;
        return result == 0 ? players[players.length - 1].name : players[result - 1].name;
    }

    public static long[] powersOfTwo(int n) {
        //Powers of 2
        long[] numbers = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            numbers[i] = (long) Math.pow(2, i);
        }
        return numbers;
    }

    public static String chromosomeCheck(String sperm) {
        //Determine offspring sex based on genes XX and XY chromosomes
        return "Congratulations! You're going to have a " + (sperm.contains("Y") ? "son." : "daughter.");
    }

    static int dutyFree(int normPrice, int discount, int hol) {
        //Holiday VIII - Duty Free
        return 100 * hol / (normPrice * discount);
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        //Will you make it?
        return distanceToPump <= mpg * fuelLeft;
    }

    public static String binaryAddition(int a, int b) {
        //Binary Addition
        return Integer.toBinaryString(a + b);
    }

    public static String alphabetWar(String fight) {
        //Alphabet war
        Map<Character, Integer> leftSide = new HashMap<>();
        leftSide.put('w', 4);
        leftSide.put('p', 3);
        leftSide.put('b', 2);
        leftSide.put('s', 1);

        Map<Character, Integer> rightSide = new HashMap<>();
        rightSide.put('m', 4);
        rightSide.put('q', 3);
        rightSide.put('d', 2);
        rightSide.put('z', 1);

        int left = 0;
        int right = 0;
        for (int i = 0; i < fight.length(); i++) {
            left += leftSide.getOrDefault(fight.charAt(i), 0);
            right += rightSide.getOrDefault(fight.charAt(i), 0);
        }
        return left > right ? "Left side wins!" : right > left ? "Right side wins!" : "Let's fight again!";
    }

    public static int findShort(String s) {
        //Shortest Word
        String[] words = s.split(" ");
        int shortestWord = 0;
        for (String word : words) {
            if (shortestWord == 0 || shortestWord > word.length()) {
                shortestWord = word.length();
            }
        }
        return shortestWord;
    }

    public static int maxDiff(int[] lst) {
        //max diff - easy
        int maximum = stream(lst)
                .max()
                .orElse(0);
        int minimum = stream(lst)
                .min()
                .orElse(0);
        return maximum - minimum;
    }

    public static final String generateShape(int n) {
        //Build a square
        String variable = "+";
        var result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == (n - 1)) {
                result.append(variable.repeat(n));
            } else {
                result.append(variable.repeat(n));
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static int expressionsMatter(int a, int b, int c) {
        //Expressions Matter
        int[] myArray = {a + b + c, a * b * c, a + b * c, a * b + c, (a + b) * c, a * (b + c)};
        int max = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    public static int nthSmallest(final int[] arr, final int n) {
        //Nth Smallest Element (Array Series #4)
        Arrays.sort(arr);
        return arr[n - 1];
    }

    public static String reverseWords(final String original) {
        //Reverse words
        String[] array = original.split(" ");

        if (array.length == 0)
            return original;

        int i = 0;
        for (String string : array) {
            array[i] = new StringBuilder(string).reverse().toString();
            i++;
        }

        return String.join(" ", array);
    }

    public static boolean checkForFactor(int base, int factor) {
        //Grasshopper - Check for factor
        return base % factor == 0;
    }

    public static String reverseLetter(final String str) {
        //Simple Fun #176: Reverse Letter
        return new StringBuilder(str.replaceAll("[^a-z]", "")).reverse().toString();
    }

    static String alternateCase(final String string) {
        //Alternate case
        StringBuilder temp = new StringBuilder();
        char[] arr = string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                temp.append(Character.toLowerCase(arr[i]));
            } else {
                temp.append(Character.toUpperCase(arr[i]));
            }
        }
        return temp.toString();
    }

    public static String integrate(int coefficient, int exponent) {
        //Find the Integral
        int multi = 0;
        int div = 0;

        div = exponent + 1;
        multi = coefficient / div;

        return multi + "x^" + div;
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

    public static String doubleChar(String s) {
        //Double Char
        return s.replaceAll(".", "$0$0");
    }

    static String replace(final String s) {
        //Exclamation marks series #11: Replace all vowel to exclamation mark in the sentence
        return s.replaceAll("(?i)[aeiou]", "!");
    }

    public static int[] rowWeights(final int[] weights) {
        //Row Weights
        int firstTeam = 0;
        int secondTeam = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                firstTeam += weights[i];
            } else {
                secondTeam += weights[i];
            }
        }
        return new int[]{firstTeam, secondTeam};
    }

    public static int largestPairSum(int[] numbers) {
        //Largest pair sum in array
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] + numbers[numbers.length - 2];
    }

    public static String solve(final String str) {
        //Fix string case
        int size = str.length();
        int upCase = 0;
        int lowCase = 0;
        if (size < 0) {
            return "";
        }
        for (int i = 0; i < size; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upCase++;
            } else {
                lowCase++;
            }
        }
        if (upCase < lowCase) {
            return str.toLowerCase();
        } else if (upCase > lowCase) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
    }

    public static boolean validatePin(String pin) {
        //Regex validate PIN code
        return pin.matches("\\d{4}|\\d{6}");
    }

    public static int stray(int[] numbers) {
        //Find the stray number
        Arrays.sort(numbers);
        int centralNumber = numbers[numbers.length / 2];
        if (numbers[0] == centralNumber) {
            return numbers[numbers.length - 1];
        } else {
            return numbers[0];
        }
    }

    static int closeCompare(double a, double b) {
        //Compare within margin
        return closeCompare(a, b, 0);
    }

    static int closeCompare(double a, double b, double margin) {
        //Compare within margin
        return margin < Math.abs(a - b) ? Double.compare(a, b) : 0;
    }

    public static int[] solve(int[] arr) {
        //Simple remove duplicates
        ArrayList<Integer> arrayList = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp = j;
                }
            }
            if (temp == i) {
                arrayList.add(arr[i]);
            }
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        //Predict your age!
        return (int) Math.sqrt(age1 * age1 + age2 * age2 + age3 * age3 + age4 * age4 + age5 * age5 + age6 * age6 + age7 * age7 + age8 * age8) / 2;
    }

    public static String isSortedAndHow(int[] array) {
        //Sorted? yes? no? how?
        if (array[0] < array[1] && array[0] < array[array.length - 1]) {
            return "yes, ascending";
        }
        if (array[0] > array[1] && array[0] > array[array.length - 1]) {
            return "yes, descending";
        } else {
            return "no";
        }
    }

    public static int minSum(int[] passed) {
        //Minimize Sum Of Array (Array Series #1)
        Arrays.sort(passed);

        int min = 0;
        for (int i = 0; i < passed.length / 2; i++) {
            min += passed[i] * passed[passed.length - i - 1];
        }
        return min;
    }

    public static long sumCubes(long n) {
        //Sum of Cubes
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) Math.pow(i, 3);
        }
        return sum;
    }

    public static String[] capitalize(String s) {
        //Alternate capitalization
        String u = s.toUpperCase();
        String o = "";
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                o += u.charAt(i);
                t += s.charAt(i);
            } else {
                o += s.charAt(i);
                t += u.charAt(i);
            }
        }
        return new String[]{o, t};
    }

    public static int maxTriSum(int[] numbers) {
        //Maximum Triplet Sum (Array Series #7)
        return IntStream.of(numbers)
                .distinct()
                .boxed()
                .sorted(Collections.reverseOrder())
                .limit(3)
                .mapToInt(value -> value.intValue())
                .sum();
    }


    public static boolean all(int[] list, IntPredicate predicate) {
        //Enumerable Magic #1 - True for All?
        for (int i : list)
            if (!predicate.test(i))
                return false;
        return true;
    }

    public static long maxProduct(int[] numbers, int sub_size) {
        //Product Of Maximums Of Array (Array Series #2)
        long result = 1;
        Arrays.sort(numbers);

        for (int i = 0; i < sub_size; i++) {
            result *= numbers[(numbers.length - 1) - i];
        }

        return result;
    }

    public static List arrayLeaders(int[] numbers) {
        //Array Leaders (Array Series #3)
        var arr = new ArrayList<Integer>();
        int sum = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] > sum)
                arr.add(0, numbers[i]);
            sum += numbers[i];
        }
        return arr; // Do your magic!
    }

    public static int[] solve(String[] arr) {
        //Alphabet symmetry
        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String aux = arr[i].toLowerCase();
            int cont = 0;
            for (int j = 0; j < aux.length(); j++) {
                if ((aux.charAt(j) - 97) == j) {
                    cont++;
                }
            }
            numbers[i] = cont;
        }
        return numbers;
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
        return stream(array).sum();
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

class MonkeyCounter {
    public static int[] monkeyCount(final int n) {
        //Count the Monkeys!
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
}

class YesOrNo {
    //Convert boolean values to strings 'Yes' or 'No'.
    public static String boolToWord(boolean b) {
        return b == true ? "Yes" : "No";
    }
}

class CodeWarsMath {
    //Find Nearest square number
    public static int nearestSq(final int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}

class DivisibleNb {
    //Is n divisible by x and y?
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}

class GhostCode {
    //Ghost code?!
    public static String helloName(final String name) {
        if (name == null || name.equals("")) {
            return "Hello world!";
        } else {
            return "Hello my name is " + name;
        }
    }
}

class Swapper {
    //Swap Values
    public Object[] arguments;

    public Swapper(final Object[] arguments) {
        this.arguments = arguments;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0], arguments[1]};
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

class MyUtilities {

    public boolean isDigit(String s) {
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
        return stream(arr1).sum() + stream(arr2).sum();
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
        for (int number : numbers) {
            if (number % divider == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        int i = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                arr[i] = number;
                i++;
            }
        }
        return arr;
    }
}

class BooleanToString {
    //Convert a Boolean to a String
    public static String convert(boolean b) {
        return b ? "true" : "false";
    }

}

class Plural {
    public static boolean isPlural(float f) {
        //Plural
        return (f != 1);
    }
}

class Dinglemouse {
    public static String replaceDots(final String str) {
        //Replace all dots
        return str.replaceAll("\\.", "-");
    }
}

class Numbers {
    public static double TwoDecimalPlaces(double number) {
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

class WideMouthedFrog {
    //The Wide-Mouthed frog!
    public static String mouthSize(String animal) {
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
        for (int i = 0; i < arr.length; i++) {
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


    public static boolean isDigit(String s) {
        //Regexp Basics - is it a digit?
        return s.matches("[0-9]");
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
        for (int a : arr)
            if (a > max) max = a;
            else if (a < min) min = a;
        return max - min;
    }

    public static String warnTheSheep(String[] array) {
        //A wolf in sheep's clothing
        int wolf = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == "wolf") {
                wolf = i;
            }
        }

        if (wolf == (array.length - 1)) {
            return "Pls go away and stop eating my sheep";
        } else {
            return "Oi! Sheep number " + (array.length - wolf - 1) + "! You are about to be eaten by a wolf!";
        }
    }

    public static int[] take(int[] arr, int n) {
        //Enumerable Magic #25 - Take the First N Elements
        if (n > 0 && arr.length >= n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = arr[i];
            }
            return result;
        }
        if (n > 0 && arr.length < n) return arr;
        return new int[0];
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
        return new int[]{humanYears, humanYears > 1 ? 16 + 4 * humanYears : 15, humanYears > 1 ? 14 + 5 * humanYears : 15};
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
        s1 = (s1 + s2 + s3) / 3;
        return s1 >= 90 ? 'A' : s1 >= 80 ? 'B' : s1 >= 70 ? 'C' : s1 >= 60 ? 'D' : 'F';
    }
}

class TipCalculator {
    //Tip Calculator
    public static Integer calculateTip(double amount, String rating) {
        String rate = rating.toLowerCase();
        System.out.println(rate + " " + amount);
        switch (rate) {
            case "terrible":
                return (int) Math.ceil(amount * 0 / 100);
            case "poor":
                return (int) Math.ceil(amount * 5 / 100);
            case "good":
                return (int) Math.ceil(amount * 10 / 100);
            case "great":
                return (int) Math.ceil(amount * 15 / 100);
            case "excellent":
                return (int) Math.ceil(amount * 20 / 100);
            default:
                return null;

        }
    }
}

class Java {
    //You Can't Code Under Pressure #1
    public static int doubleInteger(int i) {
        return i * 2;
    }
}

class Nessie {
    //A Strange Trip to the Market
    public static boolean isLockNessMonster(String s) {
        return s.contains("tree fiddy") || s.contains("3.50");
    }
}

class Geometry {
    //Area of a Square
    public static double squareArea(double A) {
        double l = (2 * A) / Math.PI;
        double x = l * l;
        double y = Math.round(x * 100) * 0.01d;
        return y;
    }
}

class AgeDiff {
    //How old will I be in 2099?
    static String calculateAge(int birth, int year) {
        int age = year - birth;
        return age == 0 ? "You were born this very year!"
                : age > 0 ? String.format("You are %d year%s old.", age, age == 1 ? "" : "s")
                : String.format("You will be born in %d year%s.", -age, -age == 1 ? "" : "s");
    }
}

class TotalPoints {
    //Total amount of points
    public static int points(String[] games) {
        int points = 0;
        for (int i = 0; i < 10; i++) {
            if (games[i].charAt(0) > games[i].charAt(2)) {
                points = points + 3;
            } else if (games[i].charAt(0) == games[i].charAt(2)) {
                points = points + 1;
            } else {
                points = points + 0;
            }
        }
        return points;
    }
}

class Sleigh {
    //Sleigh Authentication
    public static Boolean authenticate(String name, String password) {
        return name.equals("Santa Claus") && password.equals("Ho Ho Ho!");
    }
}

class Bob {
    //Will there be enough space?
    public static int enough(int cap, int on, int wait) {
        return Math.max(0, on + wait - cap);
    }
}

class Paper {
    //Beginner Series #1 School Paperwork
    public static int paperWork(int n, int m) {
        return n > 0 && m > 0 ? n * m : 0;
    }
}

class SaleHotdogs {
    //Training JS #7: if..else and ternary operator
    public static int saleHotdogs(final int n) {
        return n * (n < 5 ? 100 : n < 10 ? 95 : 90);
    }
}

class Factorial {
    //Factorial
    public static long factorial(int n) {
        if (n <= 1) return 1;
        else return n * factorial(n - 1);
    }

    public int factorial7ku(int n) {
        if (n < 0 || n > 12) throw new IllegalArgumentException();
        return rangeClosed(2, n).reduce(1, (x, y) -> x * y);
    }
}

class FindOddCubes {
    //Sum of Odd Cubed Numbers
    public static int cubeOdd(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 3);
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}

class Welcome {
    public static String greet(String language) {
        //Welcome!
        HashMap<String, String> db = new HashMap<>();
        db.put("english", "Welcome");
        db.put("czech", "Vitejte");
        db.put("danish", "Velkomst");
        db.put("dutch", "Welkom");
        db.put("estonian", "Tere tulemast");
        db.put("finnish", "Tervetuloa");
        db.put("flemish", "Welgekomen");
        db.put("french", "Bienvenue");
        db.put("german", "Willkommen");
        db.put("irish", "Failte");
        db.put("italian", "Benvenuto");
        db.put("latvian", "Gaidits");
        db.put("lithuanian", "Laukiamas");
        db.put("polish", "Witamy");
        db.put("spanish", "Bienvenido");
        db.put("swedish", "Valkommen");
        db.put("welsh", "Croeso");
        return db.containsKey(language) ? db.get(language) : db.get("english");
    }
}

class NthSeries {
    //Sum of the first nth term of Series
    public static String seriesSum(int n) {
        double result = 0;
        for (int i = 0; i < n; i++) {
            result = result + (1 / (double) ((3 * i) + 1));
        }
        return String.format("%.2f", result);
    }
}

class MostDigits {
    //Most digits
    public static int findLongest(int[] numbers) {
        int mostDigits = Integer.MIN_VALUE;
        int length = 0;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("-")) {
                if (list.get(i).length() - 1 > length) {
                    length = list.get(i).length() - 1;
                    mostDigits = Integer.valueOf(list.get(i));
                }
            } else {
                if (list.get(i).length() > length) {
                    length = list.get(i).length();
                    mostDigits = Integer.valueOf(list.get(i));
                }
            }

        }

        return mostDigits;
    }
}

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

class God {
    //Basic subclasses - Adam and Eve
    public static Human[] create() {
        Human Adam = new Man();
        Human Eve = new Woman();
        return new Human[]{Adam, Eve};
    }
}

class Human {
    public Human() {
    }
}

class Man extends Human {
    public Man() {
    }
}

class Woman extends Man {
    public Woman() {
    }
}

class Banjo {

    public static String areYouPlayingBanjo(String name) {
        //Are You Playing Banjo?
        if (name.charAt(0) == 'R' || name.charAt(0) == 'r') {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }

    }
}

class EasyWallpaper {
    //Easy wallpaper
    public String wallpaper(double l, double w, double h) {
        var ns = new String[]{
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        if (l * w * h == 0) return ns[0];
        return ns[(int) Math.ceil((l + w) * h * 2.3 / 5.2)];
    }
}

class ArithmeticFunction {
    //Make a function that does arithmetic!
    public static int arithmetic(int a, int b, String operator) {
        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            default:
                return a / b;
        }
    }
}

class DnaStrand {
    //Complementary DNA
    public static String makeComplement(String dna) {
        return dna.replace('T', '_').replace('A', 'T').replace('_', 'A').replace('C', '_').replace('G', 'C').replace('_', 'G');
    }
}

class Evaporator {

    public static int evaporator(double content, double evap_per_day, double threshold) {
        //Deodorant Evaporator
        int result = 0;
        double percentage = 100;
        while (percentage > threshold) {
            percentage -= percentage * (evap_per_day / 100);
            result++;
        }

        return result;
    }
}

class GiftSorter {
    public String sortGiftCode(String code) {
        //Sort the Gift Code
        char[] result = code.toCharArray();
        Arrays.sort(result);
        return new String(result);
    }
}

class Printer {

    public static String printerError(String s) {
        //Printer Errors
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}

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

class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        //Growth of a Population
        double habitants = 0;
        int result = 0;
        while (habitants < p) {
            habitants = p0 + (p0 * (percent / 100)) + aug;
            p0 = (int) habitants;
            result++;
        }
        return result;

    }
}

class BumpsTheRoad {
    public static String bumps(final String road) {
        //Bumps in the Road
        return road.replace("_", "").length() > 15 ? "Car Dead" : "Woohoo!";
    }
}

class Spacify {
    public static String spacify(String str) {
        //Spacify!
//        String test = "";
//        char[] result = str.toCharArray();
//        for (int i = 0; i < result.length ; i++) {
//            test += result[i];
//            test += " ";
//        }
//        return test.trim();
        return str.replaceAll("", " ").trim();
    }
}

class SequenceSum {
    public static String showSequence(int value) {
        //Sum of numbers from 0 to N
        if (value < 0) {
            return value + "<0";
        }

        if (value == 0) {
            return "0=0";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= value; i++) {
            result = result.append(i + "+");
        }
        result = result.deleteCharAt(result.length() - 1);

        int total = (value * (value + 1) / 2);
        result = result.append(" = " + total);

        return result.toString();
    }

  /*public static void main(String args[]){
    int param=Integer.ParseInt(args[0]);
    SequenceSum.showSequence(param);
  }*/
}

class KataExampleTwist {
    public static String[] kataExampleTwist() {
        //Kata Example Twist
        String[] websites = new String[1000];
        java.util.Arrays.fill(websites, "codewars");
        return websites;
    }
}

class DecTools {
    //Number of Decimal Digits
    public static int Digits(long n) {
        return Long.toString(n).length();
    }
}

class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
        //Round up to the next multiple of 5
        while (number % 5 != 0) {
            number++;
        }
        return number;
    }
}

class BlueAndRedMarbles {
    public static double guessBlue(double blueStart, double redStart, int bluePulled, int redPulled) {
        //Thinkful - Number Drills: Blue and red marbles
        double blues = blueStart - bluePulled;
        double reds = redStart - redPulled;
        return blues / (blues + reds);
    }
}

class GpsSpeed {
    public static int gps(int s, double[] x) {
        //Speed Control
        int result = 0;
        for (int i = 0; i < x.length - 1; i++) {
            int avrSpeed = (int) (3600 * (x[i + 1] - x[i]) / s);
            result = (result < avrSpeed) ? avrSpeed : result;
        }

        return result;
    }
}

class DescendingOrder {
    public static int sortDesc(final int num) {
        //Descending Order
        String str = Integer.toString(num);
        String[] numb = str.split("");
        Integer numArr[] = new Integer[numb.length];

        for (int i = 0; i < numb.length; i++) {
            numArr[i] = Integer.parseInt(numb[i]);
        }

        Arrays.sort(numArr, Collections.reverseOrder());

        int result = 0;

        for (int i = numArr.length - 1, n = 0; i >= 0; --i, n++) {
            int pos = (int) Math.pow(10, i);
            result += numArr[n] * pos;
        }
        return result;
    }

}

class LineNumbering {
    static List<String> number(List<String> lines) {
        //Testing 1-2-3
        ArrayList<String> result = new ArrayList();
        int i = 0;
        for (String s : lines) {
            result.add(++i + ": " + s);
        }
        return result;
    }

}

class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        //Ones and Zeros
        String result = "";
        for (int i = 0; i < binary.size(); i++) {
            result += binary.get(i);
        }
        return Integer.parseInt(result, 2);
    }
}

class OddEvenSort {
    public static String sortMyString(String s) {
        //Odd-Even String Sort
        var first = new StringBuilder();
        var second = new StringBuilder();
        for (var i = 0; i < s.length(); i++) {
            (i % 2 == 0 ? second : first).append(s.charAt(i));
        }
        return second.append(" ").append(first).toString();
    }
}

class XO {
    public static boolean getXO(String str) {
        //Exes and Ohs
        char[] charsArray = str.toLowerCase().toCharArray();

        int totalO = 0;
        int totalX = 0;

        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] == 'o') {
                totalO++;
            }
            if (charsArray[i] == 'x') {
                totalX++;
            }
        }

        if (totalO == totalX) {
            return true;
        } else {
            return false;
        }

    }
}

class ArraysCodeWars {
    public static int findSmallest(final int[] numbers, final String toReturn) {
        //Smallest value of an array
        int value = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < value) {
                index = i;
                value = numbers[i];
            }
        }
        if (toReturn.equals("value")) {
            return value;
        } else {
            return index;
        }
    }
}


class Person {
    //The Office II - Boredom Score
    final String name;
    final String department;
    final int happiness;

    public Person(String name, String department, int happiness) {
        this.name = name;
        this.department = department;
        this.happiness = happiness;
    }
}


class TheOffice {
    public static String boredom(Person[] staff) {
        //The Office II - Boredom Score
        Map<String, Integer> teams = Map.of(
                "accounts", 1,
                "finance", 2,
                "canteen", 10,
                "regulation", 3,
                "trading", 6,
                "change", 6,
                "IS", 8,
                "retail", 5,
                "cleaning", 4,
                "pissing about", 25
        );

        int result = Arrays.stream(staff)
                .mapToInt(s -> teams.get(s.department))
                .sum();

        if (result <= 80) {
            return "kill me now";
        } else if (result < 100) {
            return "i can handle this";
        } else {
            return "party time!!";
        }
    }

    public static String outed(Person[] meet, String boss) {
        //The Office I - Outed
        double rating = 0;
        for (Person a : meet) {
            rating += a.happiness;
            if (a.name.equals(boss)) rating += a.happiness;
        }
        return (rating / meet.length) <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }

}

class JadenCase {

    public static String toJadenCase(String phrase) {
        //Jaden Casing Strings
        if (phrase == null || phrase.equals("")) {
            return null;
        }
        String[] str = phrase.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : str) {
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1);
            result.append(first).append(all).append(" ");
        }
        return result.toString().trim();
    }
}

class AngleSum {
    public static int sumOfAngles(int n) {
        //Sum of angles
        return 180 * (n - 2);
    }
}

class Rotations {
    public static Boolean containAllRots(String strng, List<String> arr) {
        //All Inclusive?
        for (int i = 0; i < strng.length(); i++)
            if (!arr.contains(strng.substring(i, strng.length()) + strng.substring(0, i)))
                return false;
        return true;
    }
}

class FindDivisor {
    public long numberOfDivisors(int n) {
        //Count the divisors of a number
        long result = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result++;
            }
        }
        return result;
    }
}

class Slope {
    public String slope(int[] points) {
        //Find the Slope
        int y = points[3] - points[1];
        int x = points[2] - points[0];
        if (x == 0) {
            return "undefined";
        } else {
            return String.valueOf(y / x);
        }
    }

}