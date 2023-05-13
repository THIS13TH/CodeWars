package Person;

import java.util.Arrays;
import java.util.Map;

class Person {
    //The Office II - Boredom Score
    final String name;
    final String department;
    final int happiness;

    public Person(String name, String department, int happiness) {
        this.name = name;
        this.department = department;
        this.happiness = happiness;
    }

    public static String outed(Person[] meet, String boss) {
        //The Office I - Outed
        double rating = 0;
        for (Person a : meet) {
            rating += a.happiness;
            if (a.name.equals(boss)) rating += a.happiness;
        }
        return (rating / meet.length) <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }

    public static Object meeting(char[] x) {
        //The Office IV - Find a Meeting Room
        int emptyRoom = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'O') {
                return emptyRoom = i;
            }
        }
        return "None available!";
    }

    public static String boredom(Person[] staff) {
        //The Office II - Boredom Score
        Map<String, Integer> teams = Map.of(
                "accounts", 1,
                "finance", 2,
                "canteen", 10,
                "regulation", 3,
                "trading", 6,
                "change", 6,
                "IS", 8,
                "retail", 5,
                "cleaning", 4,
                "pissing about", 25
        );

        int result = Arrays.stream(staff)
                .mapToInt(s -> teams.get(s.department))
                .sum();

        if (result <= 80) {
            return "kill me now";
        } else if (result < 100) {
            return "i can handle this";
        } else {
            return "party time!!";
        }


    }
}
