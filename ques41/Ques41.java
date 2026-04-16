package ques41;

import java.util.*;
public class Ques41 {
    public static int solve(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) return num;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        System.out.println(solve(arr));
    }
}
