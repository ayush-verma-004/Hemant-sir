public class Ques42 {
    public static int solve(int[] arr) {
        int res = 0;
        for (int num : arr) res ^= num;
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques42");
    }
}