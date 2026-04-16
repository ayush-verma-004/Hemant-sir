public class Ques10 {
    public static int[] solve(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques10");
    }
}