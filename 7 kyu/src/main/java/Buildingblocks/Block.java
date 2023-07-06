package Buildingblocks;

class Block {
    // Good Luck!
    int width;
    int length;
    int height;

    int volume;
    int surfaceArea;

    public int getSurfaceArea() {
        return surfaceArea;
    }

    public Block(int[] arr) {
        width = arr[0];
        length = arr[1];
        height = arr[2];

        volume = width * length * height;
        surfaceArea = 2 * (width * length + width * height + length * height);
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getVolume() {
        return volume;
    }
}
