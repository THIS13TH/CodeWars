package BlueAndRedMarbles;

class BlueAndRedMarbles {
    public static double guessBlue(double blueStart, double redStart, int bluePulled, int redPulled) {
        //Thinkful - Number Drills: Blue and red marbles
        double blues = blueStart - bluePulled;
        double reds = redStart - redPulled;
        return blues / (blues + reds);
    }
}
