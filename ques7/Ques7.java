package ques7;

public class Ques7 {
    public static boolean solve(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(solve(arr, 3));
    }
}
