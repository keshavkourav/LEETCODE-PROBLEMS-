class Solution {
    public int[] replaceElements(int[] arr) {
        int maxRight = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxRight;
            if (temp > maxRight) {
                maxRight = temp;
            }
        }
        return arr;
    }
}
