package LineNumbering;

import java.util.ArrayList;
import java.util.List;

class LineNumbering {
    static List<String> number(List<String> lines) {
        //Testing 1-2-3
        ArrayList<String> result = new ArrayList();
        int i = 0;
        for (String s : lines) {
            result.add(++i + ": " + s);
        }
        return result;
    }

}
