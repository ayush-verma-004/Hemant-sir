import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array
        double average = findAverage(array);
        System.out.println("Average: " + average);
    }

    public static double findAverage(int[] array) {
        return Arrays.stream(array).average().orElse(0.0);
    }
}