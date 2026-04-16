package ques18;

import java.util.Arrays;
public class Ques18 {
    public static void solve(int[] arr) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        solve(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
