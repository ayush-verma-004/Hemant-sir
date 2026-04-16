public class Ques8 {
    public static int[] solve(int[] arr) {
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        return new int[]{even, odd};
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        int[] res = solve(arr);
        System.out.println(java.util.Arrays.toString(res));
    }
}
