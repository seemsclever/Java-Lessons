import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 2, 5};
        //           0  1  2  3  4  5
        System.out.println(Arrays.toString(arr));
        int k = 6;
        int index = 0;
        int minElements = 5;
        int leftIndex = 0;
        while (leftIndex <= arr.length - 1){
            int sum = 0;
            int amounthOfElements = 0;
            int rightIndex = leftIndex;
            while (sum <= k && rightIndex <= arr.length - 1){
                sum += arr[rightIndex];
                rightIndex++;
                amounthOfElements++;
            }
            if (sum > k && amounthOfElements < minElements){
                minElements = amounthOfElements;
                index = leftIndex;
            }
            System.out.printf("arr[%d] = %d: Используется элементов - %d, Сумма - %d%n", leftIndex, arr[leftIndex], amounthOfElements, sum);
            leftIndex++;
        }
        System.out.printf("Ответ:%nЭлементы ");
        for (int i = index; i < index + minElements; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.printf("под индексами ");
        for (int i = index; i < index + minElements; i++) {
            System.out.printf("%d ", i);
        }
    }
}