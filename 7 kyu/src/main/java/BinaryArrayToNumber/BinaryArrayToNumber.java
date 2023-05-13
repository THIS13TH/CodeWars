package BinaryArrayToNumber;

import java.util.List;

import static java.lang.Integer.parseInt;

class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        //Ones and Zeros
        String result = "";
        for (int i = 0; i < binary.size(); i++) {
            result += binary.get(i);
        }
        return parseInt(result, 2);
    }
}
