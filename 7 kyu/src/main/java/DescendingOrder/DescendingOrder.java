package DescendingOrder;

import java.util.Arrays;
import java.util.Collections;

import static java.lang.Integer.parseInt;

class DescendingOrder {
    public static int sortDesc(final int num) {
        //Descending Order
        String str = Integer.toString(num);
        String[] numb = str.split("");
        Integer numArr[] = new Integer[numb.length];

        for (int i = 0; i < numb.length; i++) {
            numArr[i] = parseInt(numb[i]);
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
