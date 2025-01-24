public class Main {
    public static void main(String[] args) {
        int[] arr = {71, 70, 0, 0, 71};
        int maxValue = 0;
        int maxValue2 = 0;
        for (int i : arr) {
            if (i >= maxValue) {
                maxValue2 = maxValue;
                maxValue = i;
            }
            if (i > maxValue2 && i < maxValue){
                maxValue2 = i;
            }
        }
        int sum = maxValue + maxValue2;
        System.out.println("sum = " + sum);
    }
}