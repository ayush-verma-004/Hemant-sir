public class Ques28 {
    public static int[] solve(int[] arr) {
        int sumEven = 0, sumOdd = 0;
        for (int num : arr) {
            if (num % 2 == 0) sumEven += num;
            else sumOdd += num;
        }
        return new int[]{sumEven, sumOdd};
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques28");
    }
}