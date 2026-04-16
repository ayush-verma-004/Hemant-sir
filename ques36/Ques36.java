import java.util.*;
public class Ques36 {
    public static void solve(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int val : arr) {
            if (val >= 0) pos.add(val);
            else neg.add(val);
        }
        int i = 0, j = 0, k = 0;
        while (i < pos.size() && j < neg.size()) {
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
        }
        while (i < pos.size()) arr[k++] = pos.get(i++);
        while (j < neg.size()) arr[k++] = neg.get(j++);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        solve(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
