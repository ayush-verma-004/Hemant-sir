package ques2;

public class Ques2 {
    public static double solve(int[] arr) {
        if (arr.length == 0) return 0;
        int sum = 0;
        for (int num : arr) sum += num;
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques2");
    }
}