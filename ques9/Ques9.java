package ques9;

public class Ques9 {
    public static int[][] solve(int[] arr) {
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        int[] evens = new int[evenCount];
        int[] odds = new int[oddCount];
        int e = 0, o = 0;
        for (int num : arr) {
            if (num % 2 == 0) evens[e++] = num;
            else odds[o++] = num;
        }
        return new int[][]{evens, odds};
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques9");
    }
}