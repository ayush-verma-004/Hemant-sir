package ques35;

public class Ques35 {
    public static void solve(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) arr[index++] = num;
        }
        while (index < arr.length) arr[index++] = 0;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques35");
    }
}