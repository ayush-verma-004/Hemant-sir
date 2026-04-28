package ques12;

import java.util.Arrays;

public class Ques12 {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        System.out.println("S1: " + s1 + ", S2: " + s2);
        System.out.println("Are Anagrams: " + areAnagrams(s1, s2));
    }
}
