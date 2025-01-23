public class Main {
    public static void main(String[] args) {
        int number = 123456789;
        String stringNumber = String.valueOf(number);
        char[] arrayOfDigits = stringNumber.toCharArray();
        String reversedString = "";
        System.out.println(stringNumber);
        for (int i = arrayOfDigits.length - 1; i >= 0; i--) {
            reversedString += arrayOfDigits[i];
        }
        System.out.println(reversedString);
    }
}