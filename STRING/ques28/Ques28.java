package ques28;

public class Ques28 {
    public static String compress(String str) {
        if (str == null || str.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aaabb";
        System.out.println("Input: " + input);
        System.out.println("Compressed: " + compress(input));
    }
}
