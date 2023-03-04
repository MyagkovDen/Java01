// Реализовать простой калькулятор

package task03;

import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите  a: ");
        int a = iScanner.nextInt();
        System.out.print("Введите действие: ");
        // iScanner.nextLine();
        char act = iScanner.next().charAt(0);
        System.out.print("Введите b: ");
        int b = iScanner.nextInt();
        iScanner.close();

        if (act == '+') {
            int res = a + b;
            System.out.printf("%d %c %d = %d", a, act, b, res);
        }
        if (act == '-') {
            int res = a - b;
            System.out.printf("%d %c %d = %d", a, act, b, res);
        }
        if (act == '*') {
            int res = a * b;
            System.out.printf("%d %c %d = %d", a, act, b, res);
        }
        if (act == '/') {
            float res = (a * 1.0f / b);
            System.out.printf("%d %c %d = %f", a, act, b, res);
        }
    }
}