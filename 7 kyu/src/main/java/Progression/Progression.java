package Progression;

class Progression {
    public static String arithmeticSequenceElements(int first, int step, long total) {
        //Arithmetic progression
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < total; i++) {
            sb.append(first + step * i).append(", ");
        }
        return sb.delete(sb.length() - 2, sb.length()).toString();
    }
}
