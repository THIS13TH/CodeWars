package MixedSum;

import java.util.List;

import static java.lang.Integer.parseInt;

class MixedSum {
    //Sum Mixed Array
    public int sum(List<?> mixed) {
        Object[] arr = mixed.toArray();
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += parseInt(arr[i].toString());
        }
        return result;
    }
}
