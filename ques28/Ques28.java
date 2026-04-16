public class Ques28 {
    public static int[] solve(int[] arr) {
        int sumEven = 0, sumOdd = 0;
        for (int num : arr) {
            if (num % 2 == 0) sumEven += num;
            else sumOdd += num;
        }
        return new int[]{sumEven, sumOdd};
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        int[] res = solve(arr);
        System.out.println(java.util.Arrays.toString(res));
    }
}
