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
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        System.out.println(solve(arr));
    }
}
