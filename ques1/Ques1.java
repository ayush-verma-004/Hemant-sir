public class Ques1 {
    public static int solve(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        System.out.println(solve(arr));
    }
}
