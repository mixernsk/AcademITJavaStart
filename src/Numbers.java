import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        String numberAsString = String.valueOf(number);

        int sumOfDigits = 0;
        int sumOfOddDigits = 0;
        int maxDigit = 0;

        for (char ch : numberAsString.toCharArray()) {
            int digit = Character.getNumericValue(ch);

            sumOfDigits += digit;

            if (digit % 2 != 0) {
                sumOfOddDigits += digit;
            }

            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }

        System.out.println("Сумма всех цифр числа: " + sumOfDigits);
        System.out.println("Сумма нечетных цифр числа: " + sumOfOddDigits);
        System.out.println("Максимальная цифра числа: " + maxDigit);

    }
}
