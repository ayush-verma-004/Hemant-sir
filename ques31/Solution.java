public class Solution {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, 7}; // Sample array
        System.out.println("Difference between largest and smallest element: " + findDifference(array));
    }

    public static int findDifference(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }
}