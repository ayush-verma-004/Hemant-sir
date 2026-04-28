package ques29;

public class Ques29 {
    public static String runLengthEncoding(String str) {
        if (str == null || str.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i)).append(count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "wwwwaaadexxxxxxywww";
        System.out.println("Input: " + input);
        System.out.println("RLE: " + runLengthEncoding(input));
    }
}
