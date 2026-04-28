package ques37;

public class Ques37 {
    public static void findMinMaxSubstrings(String str, int k) {
        if (str.length() < k) return;
        String minSub = str.substring(0, k);
        String maxSub = str.substring(0, k);

        for (int i = 1; i <= str.length() - k; i++) {
            String sub = str.substring(i, i + k);
            if (sub.compareTo(minSub) < 0) minSub = sub;
            if (sub.compareTo(maxSub) > 0) maxSub = sub;
        }
        System.out.println("Smallest Substring of length " + k + ": " + minSub);
        System.out.println("Largest Substring of length " + k + ": " + maxSub);
    }

    public static void main(String[] args) {
        String input = "welcometojava";
        int k = 3;
        System.out.println("Input: " + input + ", k: " + k);
        findMinMaxSubstrings(input, k);
    }
}
