package ques20;

public class Ques20 {
    public static Integer solve(int[] arr) {
        if (arr.length < 2) return null;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        return secondMin == Integer.MAX_VALUE ? null : secondMin;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques20");
    }
}