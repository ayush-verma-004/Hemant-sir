package ques3;

public class Ques3 {
    public static int[] solve(int[] arr) {
        if (arr.length == 0) return new int[]{};
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques3");
    }
}