// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или 
//сообщить, что его нет.

package task04;

import java.util.Scanner;

public class task04 {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String equation = iScanner.nextLine();
        iScanner.close();

        String[] parts = equation.split(" ");
        String arg1 = parts[0];
        String arg2 = parts[2];
        int c = Integer.parseInt(parts[4]);

        for (int i = 0; i < 10; i++) {
            String s1 = Integer.toString(i);
            String replArg1 = arg1.replace("?", s1);
            for (int j = 0; j < 10; j++) {
                String s2 = Integer.toString(j);
                String replArg2 = arg2.replace("?", s2);
                int a = Integer.parseInt(replArg1);
                int b = Integer.parseInt(replArg2);
                if (a + b == c) {
                    System.out.printf("%d + %d = %d", a, b, c);
                }
            }
        }
    }
}
