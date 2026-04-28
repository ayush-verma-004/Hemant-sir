package ques24;

public class Ques24 {
    public static void printAllSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Input: " + input);
        printAllSubstrings(input);
    }
}
