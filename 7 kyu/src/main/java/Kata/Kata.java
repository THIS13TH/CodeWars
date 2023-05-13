package Kata;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntUnaryOperator;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;
import static java.util.Arrays.stream;

public class Kata {
    //Highest and Lowest
    public static String highAndLow(String numbers) {
        String strArr[] = numbers.split(" ");

        int numArr[] = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = parseInt(strArr[i]);
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

    public static String binaryAddition(int a, int b) {
        //Binary Addition
        return toBinaryString(a + b);
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

    public static long filterString(final String value) {
        //Filter the number
        String result = "";
        char[] arr = value.toCharArray();
        for (char i : arr) {
            if (Character.isDigit(i)) {
                result += Character.getNumericValue(i);
            }
        }
        return Long.parseLong(result);
        //return Long.valueOf(value.replaceAll("\\D", ""));
    }

    public static int[] Solve(String word) {
        //Simple string characters
        int[] result = new int[4];

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                result[0]++;
            } else if (Character.isLowerCase(word.charAt(i))) {
                result[1]++;
            } else if (Character.isDigit(word.charAt(i))) {
                result[2]++;
            } else {
                result[3]++;
            }
        }
        return result;
    }

    public static boolean smallEnough(int[] a, int limit) {
        //Small enough? - Beginner
        for (int i : a) {
            if (i > limit) {
                return false;
            }
        }
        return true;
    }

    public static String getMiddle(String word) {
        //Get the Middle Character
        int middle = word.length() / 2;
        StringBuilder result = new StringBuilder();

        if (word.length() % 2 == 0) {
            result.append(word.charAt(middle - 1));
            result.append(word.charAt(middle));
        } else {
            result.append(word.charAt(middle));
        }
        return result.toString();
    }

    public static int[] flattenAndSort(int[][] array) {
        //Flatten and sort an array
        int length = 0;

        for (int[] line : array)
            length = length + line.length;

        int[] out = new int[length];

        int i = 0;
        for (int[] line : array)
            for (int cell : line) {
                out[i] = cell;
                i++;
            }

        Arrays.sort(out);
        return out;
    }

    public static String swap(String st) {
        //Changing letters
        return st.replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O").replace("u", "U");
    }


    public static int stantonMeasure(int[] arr) {
        //Stanton measure
        int stanton = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                stanton++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == stanton) {
                result++;
            }
        }
        return result;
    }

    public static String vowel2Index(String s) {
        //The old switcheroo
//        String result = "";
//        String[] temp = s.split("");
//        for (int i = 0; i < temp.length; i++) {
//            if(temp[i].equals("a")){
//                temp[i] = String.valueOf(i + 1);
//            }else if(temp[i].equals("e")){
//                temp[i] = String.valueOf(i + 1);
//            }else if(temp[i].equals("i")){
//                temp[i] = String.valueOf(i + 1);
//            }else if(temp[i].equals("o")){
//                temp[i] = String.valueOf(i + 1);
//            }else if(temp[i].equals("i")){
//                temp[i] = String.valueOf(i + 1);
//            }
//        }
//        for (int i = 0; i < temp.length; i++) {
//            result += temp[i];
//        }
//        return result;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) == -1) result.append(s.charAt(i));
            else result.append(i + 1);
        }
        return result.toString();
    }

    public static String stringMerge(String s1, String s2, char letter) {
        //String Merge!
        return s1.substring(0, s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
    }

    public static int unluckyDays(int year) {
        //Unlucky Days
        Calendar calendar = Calendar.getInstance();
        int count = 0;
        for (int i = 0; i < 12; i++) {
            calendar.set(year, i, 13);
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                count++;
            }
        }
        return count;
    }

    static String toLeetSpeak(final String speak) {
        //ToLeetSpeak
        return speak
                .replaceAll("A", "@")
                .replaceAll("B", "8")
                .replaceAll("C", "(")
                .replaceAll("E", "3")
                .replaceAll("G", "6")
                .replaceAll("H", "#")
                .replaceAll("I", "!")
                .replaceAll("L", "1")
                .replaceAll("O", "0")
                .replaceAll("S", "\\$")
                .replaceAll("T", "7")
                .replaceAll("Z", "2");
    }

    public static boolean validSpacing(String s) {
        //Valid Spacing
        return s.trim().replace("  ", "").equals(s);
    }

    public static String lastSurvivor(String letters, int[] coords) {
        //Last Survivor
        StringBuilder result = new StringBuilder(letters);
        for (int i = 0; i < coords.length; i++) {
            result.deleteCharAt(coords[i]);
        }
        return result.toString();
    }

    public static String longestWord(String wordString) {
        //Inspiring Strings
        String[] str = wordString.split(" ");
        String result = "";
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > max) {
                max = str[i].length();
                result = str[i];
            } else if (max == str[i].length()) {
                result = str[i];

            }
        }
        return result;
    }

    public static boolean isAnagram(String test, String original) {
        //Anagram Detection
        for (char c : test.toCharArray()) {
            if (!original.toLowerCase().contains("" + Character.toLowerCase(c))) {
                return false;
            }
        }
        return test.length() == original.length();
    }

    public static boolean compare(String s1, String s2) {
        //Compare Strings by Sum of Chars
        int result = 0;
        int result2 = 0;
        if (s1 == null) {
            s1 = "";
        }

        if (s2 == null) {
            s2 = "";
        }

        char[] tmp = s1.toUpperCase().toCharArray();
        char[] tmp2 = s2.toUpperCase().toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            result += tmp[i];
            if (tmp[i] < 65) {
                result = 0;
            }
        }
        for (int i = 0; i < tmp2.length; i++) {
            result2 += tmp2[i];
            if (tmp2[i] < 65) {
                result2 = 0;
            }
        }

        return result == result2;
    }

    public static IntUnaryOperator add(int n) {
        //Functional Addition
        return result -> result + n;
    }

    public static int minimumSteps(int[] numbers, int k) {
        //Minimum Steps (Array Series #6)
        Arrays.sort(numbers);
        int count = 0;
        int sum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (sum >= k) {
                break;
            }
            sum += numbers[i];
            count++;

        }
        return count;
    }

    public static int mostFrequentItemCount(int[] collection) {
        //Find Count of Most Frequent Item in an Array
        int count = 0;
        for (int i = 0; i < collection.length; i++) {
            int tmp = 0;
            for (int number : collection) {
                if (number == collection[i]) tmp++;
            }
            if (tmp > count) {
                count = tmp;
            }
        }
        return count;
    }

    public static String findScreenHeight(int width, String ratio) {
        //Find Screen Size
        String[] r = ratio.split(":");
        int height = width * Integer.valueOf(r[1]) / Integer.valueOf(r[0]);
        return width + "x" + height;
    }

    public static int consecutive(final int[] arr) {
        //How many consecutive numbers are needed?
        Arrays.sort(arr);
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            result += (arr[i] - arr[i - 1]) - 1;
        }
        return result;
    }

    public static String broken(final String x) {
        //The Office III - Broken Photocopier
        return x.replace("0", " ").replace("1", "0").replace(" ", "1");

//        char[] result = x.toCharArray();
//        for (int i = 0; i < result.length; i++) {
//            if(result[i] == '1'){
//                result[i] = '0';
//            }else {
//                result[i] = '1';
//            }
//        }
//        return String.valueOf(result);
    }

    public static Integer prevMultOfThree(Integer n) {
        //Previous multiple of three
        return n % 3 == 0 ? n : n > 10 ? prevMultOfThree(n / 10) : null;
    }
}
