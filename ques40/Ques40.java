public class Ques40 {
    public static int solve(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        for (int num : arr) sum -= num;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques40");
    }
}