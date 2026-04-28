package ques16;

public class Ques16 {
    public static int getLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return length;
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Input: " + input);
        System.out.println("Length (without built-in): " + getLength(input));
        System.out.println("Actual Length: " + input.length());
    }
}
