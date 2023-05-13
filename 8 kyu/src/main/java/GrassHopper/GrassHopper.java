package GrassHopper;

class GrassHopper {
    //Grasshopper - Summation
    public static int summation(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    //Grasshopper - Array Mean
    public static int findAverage(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result / nums.length;
    }

    //Grasshopper - Debug sayHello
    public static String sayHello(String name) {
        return String.format("Hello, %s", name);
    }

    //Grasshopper - Grade book
    public static char getGrade(int s1, int s2, int s3) {
        s1 = (s1 + s2 + s3) / 3;
        return s1 >= 90 ? 'A' : s1 >= 80 ? 'B' : s1 >= 70 ? 'C' : s1 >= 60 ? 'D' : 'F';
    }
}
