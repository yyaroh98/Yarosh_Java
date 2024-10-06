import java.util.Scanner;

public class ComparisonOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Принимаем два числа введенные пользователем:
        System.out.println("Введите первое число А: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число B: ");
        int b = scanner.nextInt();

        // Сравнение двух чисел:
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции сложения, вычитания, деления и умножения:
        int sum = a + b;
        int difference = a - b;
        int multiplication = a * b;

        // Выводим результаты в консоль:
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + multiplication);

        scanner.close();

    }
}
