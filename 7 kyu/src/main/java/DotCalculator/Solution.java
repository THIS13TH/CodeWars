package DotCalculator;

public class Solution {
    public static String calc(String txt){
        String[] arr = txt.split(" ");

        String first = arr[0];
        String operator = arr[1];
        String second = arr[2];

        int result = 0;

        if(operator.equals("//")){ result = first.length() / second.length();}
        if(operator.equals("-")){ result = first.length() - second.length();}
        if(operator.equals("+")){ result = first.length() + second.length();}
        if(operator.equals("*")){ result = first.length() * second.length();}


        String strResult = "";
        for (int i = 0; i < result; i++) {
            strResult += ".";
        }

        return strResult;
    }
}
