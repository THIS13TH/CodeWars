package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;

public class Solution {

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

    public static String capitalize(String s, int[] ind) {
        //Indexed capitalization
        char[] array = s.toCharArray();
        for (int i = 0; i < ind.length; i++) {
            if (ind[i] < s.length()) {
                array[ind[i]] = Character.toUpperCase(array[ind[i]]);
            }
        }
        return String.valueOf(array);
    }

    public static String vaporcode(String s) {
        //V A P O R C O D E

        s = s.replace(" ", "").replace("", "  ");
        return s.toUpperCase().substring(2, s.length() - 2);
    }

    public static String explode(String digits) {
        //Digits explosion
        String result = "";
        for (int lenthg = 0; lenthg < digits.length(); lenthg++) {
            int digit = parseInt(String.valueOf(digits.charAt(lenthg)));
            for (int number = 1; number <= digit; number++) {
                result += digits.charAt(lenthg);
            }
        }
        return result;
    }

    public static boolean tidyNumber(int number) {
        //Tidy Number (Special Numbers Series #9)
        String[] digits = ("" + number).split("");
        Arrays.sort(digits);
        return String.join("", digits).equals("" + number);

    }

    public static String solve(String a, String b) {
        //Unique string characters
        StringBuilder tmp = new StringBuilder();
        for (String s : a.split("")) if (!b.contains(s)) tmp.append(s);
        for (String s : b.split("")) if (!a.contains(s)) tmp.append(s);
        return tmp.toString();
    }

    public static boolean checkThreeAndTwo(char[] chars) {
        //Check three and two
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                countA++;
            } else if (chars[i] == 'b') {
                countB++;
            } else if (chars[i] == 'c') {
                countC++;
            }
        }
        if (countA == 3 && (countB == 2 || countC == 2)) {
            return true;
        } else if (countB == 3 && (countA == 2 || countC == 2)) {
            return true;
        } else if (countC == 3 && (countA == 2 || countB == 2)) {
            return true;
        } else {
            return false;
        }
    }

    public static int solvee(int[] arr) {
        //Simple consecutive pairs
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            if (i % 2 == 0) {
                if (arr[i + 1] - temp == 1 || temp - arr[i + 1] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static long[] productArray(int[] numbers) {
        //Product Array (Array Series #5)
        long[] result = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            long number = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    number *= numbers[j];
                }
            }
            result[i] = number;
        }
        return result;
    }

    static String insertDash(int num) {
        //Insert dashes
        return Integer.toString(num).replaceAll("[13579](?=[13579])", "$0-");
    }

    public static int maxGap(int[] numbers) {
        //Maximum Gap (Array Series #4)
        Arrays.sort(numbers);
        int result = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int diff = numbers[i] - numbers[i + 1];
            if (diff < 0) {
                diff *= -1;
            }
            if (diff > result) {
                result = diff;
            }
        }
        return result;
    }

    public static int solve7(String s) {
        //Longest vowel chain
        return Arrays.stream(s.split("[^aeiou]")).mapToInt(i -> i.length()).max().getAsInt();
    }

    public static int[] solveee(int[] arr) {
        //Max-min arrays
        int[] result = new int[arr.length];
        Arrays.sort(arr);
        int min = 0;
        int max = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[max];
                max--;
            } else {
                result[i] = arr[min];
                min++;
            }
        }
        return result;
    }
}
