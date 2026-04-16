public class Ques7 {
    public static boolean solve(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques7");
    }
}