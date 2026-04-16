import java.util.*;
public class Ques39 {
    public static int[] solve(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);
        int[] res = new int[set.size()];
        int i = 0;
        for (int num : set) res[i++] = num;
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques39");
    }
}