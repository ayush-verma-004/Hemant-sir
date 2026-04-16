package ques23;

public class Ques23 {
    public static void solve(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left]; arr[left] = arr[right]; arr[right] = temp;
            left++; right--;
        }
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques23");
    }
}