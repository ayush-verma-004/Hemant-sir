package ques39;

public class Ques39 {
    public static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutations(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Input: " + input);
        System.out.print("Permutations: ");
        printPermutations(input, "");
        System.out.println();
    }
}
