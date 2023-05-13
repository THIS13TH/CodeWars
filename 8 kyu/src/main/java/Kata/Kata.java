package Kata;


import java.util.*;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;
import static java.util.Arrays.sort;
import static java.util.Arrays.stream;

class Player {
    final String name;

    Player(String name) {
        this.name = name;
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

    //A Needle in the Haystack
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

    //Invert values
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
        return parseInt(hexString, 16);
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
        return parseInt(toBinaryString(n));
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

    public static boolean checkForFactor(int base, int factor) {
        //Grasshopper - Check for factor
        return base % factor == 0;
    }

    public static String integrate(int coefficient, int exponent) {
        //Find the Integral
        int multi = 0;
        int div = 0;

        div = exponent + 1;
        multi = coefficient / div;

        return multi + "x^" + div;
    }

    public static int[] incrementer(int[] numbers) {
        //Incrementer
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + i + 1) % 10;
//            if(numbers[i] >= 10){
//                numbers[i] = numbers[i] % 10;
//            }
        }
        return numbers;
    }

    public static boolean validateHello(String greetings) {
        //Did she say hallo?
        String[] hello = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
        for (int i = 0; i < hello.length; i++) {
            if (greetings.toLowerCase().contains(hello[i])) {
                return true;
            }
        }
        return false;
    }

    public static int[] mergeArrays(int[] first, int[] second) {
        //Merging sorted integer arrays (without duplicates)
        return IntStream.concat(IntStream.of(first), IntStream.of(second)).distinct().sorted().toArray();
    }

    public static Object[] removeEveryOther(Object[] arr) {
        //Removing Elements
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                list.add(arr[i]);
            }
        }
        return list.toArray();
    }
}
