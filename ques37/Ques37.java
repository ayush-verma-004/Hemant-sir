package ques37;

public class Ques37 {
    public static Integer solve(int[] arr) {
        int count = 0;
        Integer candidate = null;
        for (int num : arr) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        count = 0;
        for (int num : arr) if (num == candidate) count++;
        return count > arr.length / 2 ? candidate : null;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, 0, 2};
        System.out.println(solve(arr));
    }
}
