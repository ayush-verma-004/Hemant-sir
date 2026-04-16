package ques21;

import java.util.*;
public class Ques21 {
    public static int[] solve(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) result[i++] = num;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques21");
    }
}