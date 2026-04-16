public class Ques33 {
    public static boolean solve(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques33");
    }
}