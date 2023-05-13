package HappyYear;

class HappyYear {
    static public int nextHappyYear(int year) {
        //See You Next Happy Year
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        while (one == two || one == three
                || one == four || two == three
                || two == four || three == four) {
            year++;
            one = year / 1000;
            two = year / 100 % 10;
            three = year % 100 / 10;
            four = year % 10;
        }
        return year;
    }
}
