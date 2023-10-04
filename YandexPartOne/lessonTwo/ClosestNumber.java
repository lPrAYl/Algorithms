package lessonTwo;

/*
    C. Ближайшее число
        Ограничение времени	1 секунда
        Ограничение памяти	64Mb
        Ввод	стандартный ввод или input.txt
        Вывод	стандартный вывод или output.txt
        Напишите программу, которая находит в массиве элемент, самый близкий по величине к  данному числу.

        Формат ввода
        В первой строке задается одно натуральное число N, не превосходящее 1000 – размер массива. Во второй строке содержатся N чисел – элементы массива (целые числа, не превосходящие по модулю 1000). В третьей строке вводится одно целое число x, не превосходящее по модулю 1000.

        Формат вывода
        Вывести значение элемента массива, ближайшее к x. Если таких чисел несколько, выведите любое из них.

        Пример 1
        Ввод	Вывод
        5
        1 2 3 4 5
        6
        5
        Пример 2
        Ввод	Вывод
        5
        5 4 3 2 1
        3
        3
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClosestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int x = scanner.nextInt();
        int closestNumber = list.get(0);
        int minDifference = Math.abs(x - closestNumber);
        int currentDifference = minDifference;

        for (int i = 1; i < n; i++) {
            currentDifference = Math.abs(x - list.get(i));

            if (currentDifference < minDifference) {
                closestNumber = list.get(i);
                minDifference = currentDifference;
            }
        }

        System.out.println(closestNumber);
    }
}
