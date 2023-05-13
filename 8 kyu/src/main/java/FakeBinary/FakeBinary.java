package FakeBinary;

class FakeBinary {
    //Fake Binary
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
//    char[] c = numberString.toCharArray();
//        for (int i = 0; i < c.length; i++)
//    {
//        if ((c[i] - '0') < 5)
//            c[i] = '0';
//        else
//            c[i] = '1';
//    }
//        return new String(c);
}
