package EasyWallpaper;

class EasyWallpaper {
    //Easy wallpaper
    public String wallpaper(double l, double w, double h) {
        var ns = new String[]{
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        if (l * w * h == 0) return ns[0];
        return ns[(int) Math.ceil((l + w) * h * 2.3 / 5.2)];
    }
}
