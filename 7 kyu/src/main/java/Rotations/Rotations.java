package Rotations;

import java.util.List;

class Rotations {
    public static Boolean containAllRots(String strng, List<String> arr) {
        //All Inclusive?
        for (int i = 0; i < strng.length(); i++)
            if (!arr.contains(strng.substring(i, strng.length()) + strng.substring(0, i)))
                return false;
        return true;
    }
}
