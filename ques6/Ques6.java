package ques6;

public class Ques6 {
    public static void solve(int[] arr, int oldVal, int newVal) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldVal) arr[i] = newVal;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5};
        solve(arr, 2, 99);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
