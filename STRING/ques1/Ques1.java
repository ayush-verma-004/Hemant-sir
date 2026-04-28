package ques1;

public class Ques1 {
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverse(input));
    }
}
