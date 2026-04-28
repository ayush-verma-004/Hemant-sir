package ques45;

import java.util.*;
public class Ques45 {
    public static int solve(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(); 
        int maxLength = 0, start = 0;
        for (int end = 0; end < arr.length; end++) {
            if (map.containsKey(arr[end])) {
                start = Math.max(start, map.get(arr[end]) + 1);
            }
            map.put(arr[end], end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        System.out.println(solve(arr));
    }
}
