package ques8;

public class Ques8 {
    public static int[] solve(int[] arr) {
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques8");
    }
}