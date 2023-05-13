package XO;

class XO {
    public static boolean getXO(String str) {
        //Exes and Ohs
        char[] charsArray = str.toLowerCase().toCharArray();

        int totalO = 0;
        int totalX = 0;

        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] == 'o') {
                totalO++;
            }
            if (charsArray[i] == 'x') {
                totalX++;
            }
        }

        if (totalO == totalX) {
            return true;
        } else {
            return false;
        }

    }
}
