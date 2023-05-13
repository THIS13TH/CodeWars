package CharProblem;

class CharProblem {
    public static int howOld(final String herOld) {
        //Parse nice int from char problem
        return Character.getNumericValue(herOld.charAt(0));
        //return Integer.parseInt(herOld.substring(0, 1));

    }
}
