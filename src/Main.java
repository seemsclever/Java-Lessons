public class Main {
    public static void main(String[] args) {
        String str = "adsswwssda";
        char[] letters = str.toCharArray();
        boolean isPalindrom = true;
        for (int i = 0; i < letters.length/2; i++) {
            if (letters[i] != letters[letters.length - i - 1]) {
                isPalindrom = false;
                break;
            }
        }
        System.out.println("isPalindrom = " + isPalindrom);
    }
}