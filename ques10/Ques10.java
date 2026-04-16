package ques10;

public class Ques10 {
    public static int[] solve(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        int[] res = solve(arr);
        System.out.println(java.util.Arrays.toString(res));
    }
}
