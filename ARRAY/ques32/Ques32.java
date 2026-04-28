package ques32;

import java.util.*;
public class Ques32 {
    public static List<int[]> solve(int[] arr, int sum) {
        List<int[]> pairs = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>(); 
        for (int num : arr) {
            if (map.containsKey(sum - num)) {
                pairs.add(new int[]{sum - num, num});
            }
            map.put(num, 1);
        }
        return pairs;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        java.util.List<int[]> res = solve(arr, 5);
        for(int[] r : res) System.out.println(java.util.Arrays.toString(r));
    }
}
