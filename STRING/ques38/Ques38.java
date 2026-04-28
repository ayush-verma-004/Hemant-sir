package ques38;

public class Ques38 {
    public static int minFlips(String str) {
        return Math.min(getFlips(str, '0'), getFlips(str, '1'));
    }

    private static int getFlips(String str, char startChar) {
        int flips = 0;
        char next = startChar;
        for (char ch : str.toCharArray()) {
            if (ch != next) flips++;
            next = (next == '0') ? '1' : '0';
        }
        return flips;
    }

    public static void main(String[] args) {
        String input = "0001010111";
        System.out.println("Input: " + input);
        System.out.println("Min Flips: " + minFlips(input));
    }
}
