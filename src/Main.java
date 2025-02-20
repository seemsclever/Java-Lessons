import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 414, 24, 5151, 2522, 2};
        System.out.println(Arrays.toString(getNumbersWithMaxAndMinDigits(array)));
    }

    public static int[] getNumbersWithMaxAndMinDigits(int[] arr){
        int min = 0;
        int max = 0;
        int numOfDigits = 0;
        int numberWithMin = 0;
        int numberWithMax = 0;
        for (int i : arr) {
            numOfDigits = countDigits(i);
            if (numOfDigits >= max){
                max = numOfDigits;
                numberWithMax = i;
            } else if (numOfDigits <= min) {
                min = numOfDigits;
                numberWithMin = i;
            }
        }
        int[] newArr = new int[2];
        newArr[0] = numberWithMin;
        newArr[1] = numberWithMax;
        return newArr;
    }

    public static int countDigits(int a){
        int numOfDigits = 0;
        while (a > 0){
            numOfDigits++;
            a = a /10;
        }
        return numOfDigits;
    }
}