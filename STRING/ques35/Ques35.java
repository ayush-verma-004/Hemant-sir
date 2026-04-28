package ques35;

public class Ques35 {
    public static boolean isValidShuffle(String s1, String s2, String shuffle) {
        if (s1.length() + s2.length() != shuffle.length()) return false;
        int i = 0, j = 0, k = 0;
        while (k < shuffle.length()) {
            if (i < s1.length() && s1.charAt(i) == shuffle.charAt(k)) i++;
            else if (j < s2.length() && s2.charAt(j) == shuffle.charAt(k)) j++;
            else return false;
            k++;
        }
        return i == s1.length() && j == s2.length();
    }

    public static void main(String[] args) {
        String s1 = "abc", s2 = "def", s3 = "abdcef";
        System.out.println("S1: " + s1 + ", S2: " + s2 + ", Shuffle: " + s3);
        System.out.println("Is Valid Shuffle: " + isValidShuffle(s1, s2, s3));
    }
}
