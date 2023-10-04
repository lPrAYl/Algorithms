package lessonOne;
/*
    B. Треугольник
        Ограничение времени	1 секунда
        Ограничение памяти	64Mb
        Ввод	стандартный ввод или input.txt
        Вывод	стандартный вывод или output.txt
        Даны три натуральных числа. Возможно ли построить треугольник с такими сторонами. Если это возможно, выведите строку YES, иначе выведите строку NO.

        Треугольник — это три точки, не лежащие на одной прямой.

        Формат ввода
        Вводятся три натуральных числа.

        Формат вывода
        Выведите ответ на задачу.

        Пример 1
        Ввод	Вывод
        3
        4
        5

        YES
        Пример 2
        Ввод	Вывод
        3
        5
        4


        YES
        Пример 3
        Ввод	Вывод
        4
        5
        3
        YES
 */


import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
