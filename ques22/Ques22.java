import java.util.*;
public class Ques22 {
    public static Map<Integer, Integer> solve(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques22");
    }
}