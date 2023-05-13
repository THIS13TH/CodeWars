package CodeWars;

import static java.util.Arrays.stream;

class CodeWars {
    public static int strCount(String str, char letter) {
        //All Star Code Challenge #18
        char[] array = str.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == letter) {
                count += 1;
            } else if (array[i] == letter) {
                return 0;
            }

        }
        return count;
    }
}
