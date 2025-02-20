import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 3, 3};
        System.out.println(getNumbersWithMaxAndMinRepeats(array));
    }

    public static Map<Integer, Integer> getNumbersWithMaxAndMinRepeats(int[] arr){
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int counter;
        for (int key : arr) {
            counter = integerIntegerHashMap.getOrDefault(key, 0);
            counter++;
            integerIntegerHashMap.put(key, counter);
        }
        return integerIntegerHashMap;
    }
}