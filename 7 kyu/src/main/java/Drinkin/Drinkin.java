package Drinkin;

import static java.lang.Integer.parseInt;

class Drinkin {
    public static String hydrate(String drinkString) {
        //Responsible Drinking
        int count = 0;
        String[] drink = drinkString.split(" ");
        for (String str : drink) {
            try {
                count += parseInt(str);
            } catch (NumberFormatException e) {

            }

        }
        return String.format("%d glass%s of water", count, count > 1 ? "es" : "");
    }
}
