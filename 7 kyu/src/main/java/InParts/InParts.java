package InParts;

class InParts {
    public static String splitInParts(String s, int partLength) {
        //Split In Parts
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));
            count++;
            if (count == partLength) {
                result.append(" ");
                count = 0;
            }
        }
        return result.toString().trim();
    }
}
