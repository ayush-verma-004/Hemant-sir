// Solution for Question 3: Find max/min element
public class Solution {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 7};
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }
}