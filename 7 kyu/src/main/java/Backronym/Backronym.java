package Backronym;

import java.util.HashMap;
import java.util.Map;

class Backronym {
    private static Map<String, String> dictionary = new HashMap<>() {{
        put("P", "perfect");
    }};

    public static String makeBackronym(String acronym) {
        //makeBackronym
        String answer = "";
        for (int i = 0; i < acronym.length(); i++) {
            answer += dictionary.get(acronym.substring(i, i + 1).toUpperCase()) + " ";
        }
        return answer.trim();
    }
}
