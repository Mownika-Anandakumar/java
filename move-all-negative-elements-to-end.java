class Solution {
    public void segregateElements(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                temp[index++] = num;
            }
        }
        for (int num : arr) {
            if (num < 0) {
                temp[index++] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
 }
