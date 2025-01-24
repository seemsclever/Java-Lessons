public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 45, 2, 50, 46, 1, 42, 2, 6, 70, 11, 3};
        int maxValue = 0;
        int maxValue2 = 0;
        for (int i : arr) {
            if (i >= maxValue) {
                maxValue2 = maxValue;
                maxValue = i;
            }
        }
        int sum = maxValue + maxValue2;
        System.out.println("sum = " + sum);
    }
}