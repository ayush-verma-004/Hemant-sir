package ques40;

public class Ques40 {
    public static void printSubsequences(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        printSubsequences(str.substring(1), ans + str.charAt(0));
        printSubsequences(str.substring(1), ans);
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Input: " + input);
        System.out.print("Subsequences: ");
        printSubsequences(input, "");
        System.out.println();
    }
}
