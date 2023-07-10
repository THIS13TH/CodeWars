package ListFiltering;

import java.util.*;
import java.util.List;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        ArrayList<Object> arr = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getClass() == String.class) continue;
            arr.add(list.get(i));
        }
        return new ArrayList<>(arr);
    }
}
