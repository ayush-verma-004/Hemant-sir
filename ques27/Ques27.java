package ques27;

public class Ques27 {
    public static int[] solve(int[] arr) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE, third = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < first) {
                third = second; second = first; first = num;
            } else if (num < second && num != first) {
                third = second; second = num;
            } else if (num < third && num != second && num != first) {
                third = num;
            }
        }
        return new int[]{first, second, third};
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques27");
    }
}