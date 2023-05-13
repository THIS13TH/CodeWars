package Counter;

class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        //Counting sheep
        int sheeps = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == null) {
                sheeps += 0;
            } else if (arrayOfSheeps[i] == true) {
                sheeps += 1;
            }
        }
        return sheeps;
    }
}
