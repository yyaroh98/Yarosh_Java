import java.util.Scanner;

public class ComparisonString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        String a = scanner.nextLine();

        System.out.println("Введите вторую строку: ");
        String b = scanner.nextLine();


        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
// либо использоваеть метод equalsIgnoreCase(), к-й будет игнорировать регистр строки.

        scanner.close();

    }
}
