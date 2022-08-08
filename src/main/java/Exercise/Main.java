package Exercise;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Sum s = new Sum();
        Kata reversestring = new Kata();
        StringToNumber stringToNumber = new StringToNumber();

        System.out.println(s.GetSum(0, -1));
        System.out.println(s.GetSum(0, 1));
        System.out.println(RowSumOddNumbers.rowSumOddNumbers(42));

        System.out.println(Kata.solution("world"));
        System.out.println(StringToNumber.stringToNumber("1234"));
        System.out.println(Kata.numberToString(67));
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
}

class StringToNumber {
    //Convert a String to a Number!
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
