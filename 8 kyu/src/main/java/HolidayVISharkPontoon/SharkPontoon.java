package HolidayVISharkPontoon;

public class SharkPontoon {
    public static String shark(int pontoonDistance, int sharkDistance,
                               int youSpeed, int sharkSpeed, boolean dolphin) {
        if (dolphin) {
            sharkSpeed /= 2;
        }
        return pontoonDistance / youSpeed < sharkDistance / sharkSpeed ? "Alive!" : "Shark Bait!";
    }
}
