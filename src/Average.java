import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число начала диапазона:");
        int start = scanner.nextInt();
        System.out.println("Введите число конца диапазона:");
        int end = scanner.nextInt();
        if (start > 1 && end > start) {
            double average = getAverage(start, end);
            System.out.println("Среднее арифметическое заданного диапазона равно:" + average);
        } else {
            System.out.println("Число начала диапазона должно быть больше 1, и меньше числа конца диапазона");
        }
    }

    private static double getAverage(int start, int end) {
        int sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
            count++;
        }
        return (double) sum / count;
    }
}