package ques43;

public class Ques43 {
    public static int solve(int[] arr) {
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        for (int num : arr) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques43");
    }
}