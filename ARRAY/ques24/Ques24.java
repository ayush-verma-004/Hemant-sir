package ques24;

public class Ques24 {
    public static void solve(int[] arr, int k) {
        if (arr.length == 0) return;
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start]; arr[start] = arr[end]; arr[end] = temp;
            start++; end--;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solve(arr, 2);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
