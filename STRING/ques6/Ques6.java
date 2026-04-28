package ques6;

public class Ques6 {
    public static void printASCIIValues(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch + " : " + (int) ch);
        }
    }

    public static void main(String[] args) {
        String input = "ABC abc 123";
        System.out.println("Input: " + input);
        printASCIIValues(input);
    }
}
