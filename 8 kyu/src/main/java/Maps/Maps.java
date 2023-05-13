package Maps;

class Maps {
    public static int[] map(int[] arr) {
        //Beginner - Lost Without a Map
//        int[] result = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            result[i] = arr[i] * 2;
//        }
//        return result;
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
}
