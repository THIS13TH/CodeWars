package GiftSorter;

import java.util.Arrays;

class GiftSorter {
    public String sortGiftCode(String code) {
        //Sort the Gift Code
        char[] result = code.toCharArray();
        Arrays.sort(result);
        return new String(result);
    }
}
