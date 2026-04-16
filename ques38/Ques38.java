import java.util.*;
public class Ques38 {
    public static int[] solve(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) set1.add(num);
        Set<Integer> intersection = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) intersection.add(num);
        }
        int[] res = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) res[i++] = num;
        return res;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        int[] res = solve(arr1, arr2);
        System.out.println(java.util.Arrays.toString(res));
    }
}
