package ques34;

public class Ques34 {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String h = "hello", n = "ll";
        System.out.println("Haystack: " + h + ", Needle: " + n);
        System.out.println("Result: " + strStr(h, n));
    }
}
