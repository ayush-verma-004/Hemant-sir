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
        System.out.println("Execution of Ques41");
    }
}