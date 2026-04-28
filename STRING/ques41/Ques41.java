package ques41;

import java.util.ArrayList;
import java.util.List;

public class Ques41 {
    public static void generateParenthesis(int n, int open, int close, String s, List<String> res) {
        if (s.length() == 2 * n) {
            res.add(s);
            return;
        }
        if (open < n) {
            generateParenthesis(n, open + 1, close, s + "(", res);
        }
        if (close < open) {
            generateParenthesis(n, open, close + 1, s + ")", res);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> res = new ArrayList<>();
        generateParenthesis(n, 0, 0, "", res);
        System.out.println("n: " + n);
        System.out.println("Result: " + res);
    }
}
