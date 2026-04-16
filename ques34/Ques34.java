public class Ques34 {
    public static int solve(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num > target) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques34");
    }
}