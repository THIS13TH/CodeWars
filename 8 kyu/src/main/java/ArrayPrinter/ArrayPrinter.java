package ArrayPrinter;

class ArrayPrinter {
    //Printing Array elements with Comma delimiters
    public static String printArray(Object[] array) {
        String[] str = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            str[i] = String.valueOf(array[i]);
        }
        return String.join(",", str);
    }
}
