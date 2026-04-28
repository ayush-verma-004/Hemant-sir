package ques16;

public class Ques16 {
    public static void solve(int[] arr) {
        if (arr.length <= 1) return;
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        solve(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
