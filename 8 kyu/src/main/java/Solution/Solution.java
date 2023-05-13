package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

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

    static int closeCompare(double a, double b) {
        //Compare within margin
        return closeCompare(a, b, 0);
    }

    static int closeCompare(double a, double b, double margin) {
        //Compare within margin
        return margin < Math.abs(a - b) ? Double.compare(a, b) : 0;
    }

    public static boolean all(int[] list, IntPredicate predicate) {
        //Enumerable Magic #1 - True for All?
        for (int i : list)
            if (!predicate.test(i))
                return false;
        return true;
    }

    public static void main(String[] args) {
        //Classic Hello World
        System.out.println("Hello World!");
    }

    public static boolean hero(int bullets, int dragons) {
        //Is he gonna survive?
        return bullets / 2 >= dragons;
    }

    static String shortenToDate(String longDate) {
        //Remove the time
        return longDate.substring(0, longDate.indexOf(','));
    }
}
