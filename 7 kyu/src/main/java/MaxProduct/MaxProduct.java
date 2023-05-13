package MaxProduct;

class MaxProduct {
    public int adjacentElementsProduct(int[] array) {
        //Maximum Product
        int result = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            temp = array[i] * array[i + 1];
            if (temp > result) result = temp;
        }
        return result;
    }
}
