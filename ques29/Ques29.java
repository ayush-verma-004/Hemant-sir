public class Ques29 {
    public static void solve(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques29");
    }
}