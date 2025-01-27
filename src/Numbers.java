import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        int[] result = getMetricsByDivisionMethod(number);

        System.out.println("Сумма всех цифр числа: " + result[0]);
        System.out.println("Сумма нечетных цифр числа: " + result[1]);
        System.out.println("Максимальная цифра числа: " + result[2]);

    }

    private static int[] getMetricsByStringMethod(int sourceNumber) {
        String numberAsString = String.valueOf(sourceNumber);

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
        return new int[] {sumOfDigits, sumOfOddDigits, maxDigit};
    }
    private static int[] getMetricsByDivisionMethod(int sourceNumber) {
        int sumOfDigits = 0;
        int sumOfOddDigits = 0;
        int maxDigit = 0;

        while (sourceNumber > 0) {
            int digit = sourceNumber % 10;
            sumOfDigits += digit;

            if (digit % 2 != 0) {
                sumOfOddDigits += digit;
            }

            if (digit > maxDigit) {
                maxDigit = digit;
            }
            sourceNumber /= 10;
        }

        return new int[] {sumOfDigits, sumOfOddDigits, maxDigit};
    }
}
