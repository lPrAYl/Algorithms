package lessonTwo;

/*
    H. Наибольшее произведение трех чисел
        Ограничение времени	1 секунда
        Ограничение памяти	64Mb
        Ввод	стандартный ввод или input.txt
        Вывод	стандартный вывод или output.txt
        В данном списке из n ≤ 105 целых чисел найдите три числа,произведение которых максимально.

        Решение должно иметь сложность O(n), где n - размер списка.

        Выведите три искомых числа в любом порядке.

        Пример 1
        Ввод	Вывод
        3 5 1 7 9 0 9 -3 10
        10 9 9
        Пример 2
        Ввод	Вывод
        -5 -30000 -12
        -5 -12 -30000
        Пример 3
        Ввод	Вывод
        1 2 3
        3 2 1
 */

import java.util.Arrays;
import java.util.Scanner;

public class GreatestProduct3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();

        nthRearrange(numbers, 0, numbers.length, numbers.length - 1);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();


        nthRearrange(numbers, 0, numbers.length - 1, numbers.length - 2);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();

        nthRearrange(numbers, 0, numbers.length - 2, numbers.length - 3);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();

        nthRearrange(numbers, 0, numbers.length - 3, 2);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
    }

    private static void nthRearrange(int[] numbers, int left, int right, int place) {
        while (left < right) {
            int eqx = left;
            int gtx = left;
            int x = numbers[(left + right) / 2];

            for (int i = left; i < right; i++) {
                int now = numbers[i];

                if (now == x) {
                    numbers[i] = numbers[gtx];
                    numbers[gtx] = now;
                    gtx++;
                } else if (now < x) {
                    numbers[i] = numbers[gtx];
                    numbers[gtx] = numbers[eqx];
                    numbers[eqx] = now;
                    eqx++;
                    gtx++;
                }
            }

            if (place < eqx) {
                right = eqx;
            } else if (place >= gtx) {
                left = gtx;
            } else {
                return;
            }
        }
    }
}
