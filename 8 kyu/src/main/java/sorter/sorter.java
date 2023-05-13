package sorter;

import java.util.List;

import static java.util.stream.Collectors.toList;

class sorter {
    public static List<String> sort(List<String> textbooks) {
        //Sort My Textbooks
        return textbooks.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(toList());
    }
}
