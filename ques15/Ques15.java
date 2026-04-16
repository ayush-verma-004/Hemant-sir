public class Ques15 {
    public static void solve(int[] arr) {
        if (arr.length <= 1) return;
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        solve(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
