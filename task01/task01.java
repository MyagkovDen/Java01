// Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        int n = iScanner.nextInt();
        iScanner.close();

        if (n > 0) {
            int sum = 0;
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                sum += i;
                factorial *= i;
            }
            System.out.printf("n-е треугольного число %d = %d\nфакториал %d = %d", n, sum, n, factorial);
        } else {
            System.out.println("Ошибка ввода!");
        }
    }
}