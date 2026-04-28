package ques42;

public class Ques42 {
    public static int solve(int[] arr) {
        int res = 0;
        for (int num : arr) res ^= num;
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        System.out.println(solve(arr));
    }
}
