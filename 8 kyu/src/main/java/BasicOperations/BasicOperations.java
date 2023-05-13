package BasicOperations;

class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        //Basic Mathematical Operations
        if (op.equals("+")) {
            return v1 + v2;
        } else if (op.equals("-")) {
            return v1 - v2;
        } else if (op.equals("*")) {
            return v1 * v2;
        } else if (op.equals("/")) {
            return v1 / v2;
        }
        return null;
    }
}
