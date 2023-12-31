package lessonOne;
/*
    I. Узник замка Иф
        Ограничение времени	1 секунда
        Ограничение памяти	64Mb
        Ввод	стандартный ввод или input.txt
        Вывод	стандартный вывод или output.txt
        За многие годы заточения узник замка Иф проделал в стене прямоугольное отверстие размером D × E. Замок Иф сложен из кирпичей, размером A × B × C. Определите, сможет ли узник выбрасывать кирпичи в море через это отверстие, если стороны кирпича должны быть параллельны сторонам отверстия.

        Формат ввода
        Программа получает на вход числа A, B, C, D, E.

        Формат вывода
        Программа должна вывести слово YES или NO.

        Пример 1
        Ввод	Вывод
        1
        1
        1
        1
        1
        YES
        Пример 2
        Ввод	Вывод
        2
        2
        2
        1
        1
        NO
 */

import java.util.Scanner;

public class Castle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int e = scanner.nextInt();
        int d = scanner.nextInt();

        if ((d >= a || d >= b || d >= c) && (e >= a || e >= b || e >= c)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
