import java.util.Arrays;
public class Ques17 {
    public static void solve(int[] arr) {
        Arrays.sort(arr);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        solve(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
