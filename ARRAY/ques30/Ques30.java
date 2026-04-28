package ques30;

public class Ques30 {
    public static void solve(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        solve(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
