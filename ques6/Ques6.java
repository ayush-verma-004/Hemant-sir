public class Ques6 {
    public static void solve(int[] arr, int oldVal, int newVal) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldVal) arr[i] = newVal;
        }
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques6");
    }
}