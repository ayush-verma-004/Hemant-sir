package ques2;

public class Ques2 {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome(input));
        
        input = "hello";
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome(input));
    }
}
