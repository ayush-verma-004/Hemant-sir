package ques13;

public class Ques13 {
    public static boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String s1 = "ABCD", s2 = "CDAB";
        System.out.println("S1: " + s1 + ", S2: " + s2);
        System.out.println("Are Rotations: " + areRotations(s1, s2));
    }
}
