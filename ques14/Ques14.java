package ques14;

public class Ques14 {
    public static int solve(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques14");
    }
}