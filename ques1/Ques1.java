package ques1;

public class Ques1 {
    public static int solve(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques1");
    }
}