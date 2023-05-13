package CuboidVolumes;

class CuboidVolumes {
    //Difference of Volumes of Cuboids
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        int volumesFirstCuboid = 1;
        int volumesSecondCuboid = 1;

        for (int i = 0; i < 3; i++) {
            volumesFirstCuboid *= firstCuboid[i];
            volumesSecondCuboid *= secondCuboid[i];
        }

        if (volumesFirstCuboid > volumesSecondCuboid) return volumesFirstCuboid - volumesSecondCuboid;
        else {
            return volumesSecondCuboid - volumesFirstCuboid;
        }
    }
}
