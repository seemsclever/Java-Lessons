public class Main {
    public static void main(String[] args) {
        int number = 414431;
        int number2 = number;
        int reversedNumber = 0;
        int amountOfDigits = 0;
        System.out.println(number);
        while (number != 0){
            amountOfDigits++;
            number /= 10;
        }
        double i = Math.pow(10, (amountOfDigits - 1));
        while (number2 != 0){
            double digit = number2 % 10;
            reversedNumber += digit * i;
            i/=10;
            number2 /= 10;
        }
        System.out.println(reversedNumber);
    }
}