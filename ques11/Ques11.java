public class Ques11 {
    public static int[] solve(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        for (int num : arr1) merged[i++] = num;
        for (int num : arr2) merged[i++] = num;
        return merged;
    }

    public static void main(String[] args) {
        System.out.println("Execution of Ques11");
    }
}