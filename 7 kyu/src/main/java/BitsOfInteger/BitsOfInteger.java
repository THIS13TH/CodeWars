package BitsOfInteger;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;

class BitsOfInteger {
    public static int reverse_bits(int n) {
        //Reverse the bits in an integer
        return parseInt(new StringBuilder(toBinaryString(n)).reverse() + "", 2);
    }
}
