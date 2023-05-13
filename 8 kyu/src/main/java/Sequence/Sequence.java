package Sequence;

class Sequence {
    //Reversed sequence
    public static int[] reverse(int n) {
        int[] result = new int[n];
//        for (int i = 0; i <= n - 1 ; i++){
//            result[i] = i + 1 ;
//        }

//        int[] reverseResult = new int[result.length];
//        for (int i = 0; i < result.length; i++) {
//            reverseResult[result.length - 1 -i] = result[i];
//        }
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }
        return result;

    }

}
