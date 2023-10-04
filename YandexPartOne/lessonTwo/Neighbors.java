package lessonTwo;

/*
    D. Больше своих соседей
        Ограничение времени	1 секунда
        Ограничение памяти	64Mb
        Ввод	стандартный ввод или input.txt
        Вывод	стандартный вывод или output.txt
        Дан список чисел. Определите, сколько в этом списке элементов, которые больше двух своих соседей и выведите количество таких элементов.

        Формат ввода
        Вводится список чисел. Все числа списка находятся на одной строке.

        Формат вывода
        Выведите ответ на задачу.

        Пример 1
        Ввод	Вывод
        1 2 3 4 5
        0
        Пример 2
        Ввод	Вывод
        5 4 3 2 1
        0
        Пример 3
        Ввод	Вывод
        1 5 1 5 1
        2
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Neighbors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                    .map(Integer::parseInt).collect(Collectors.toList());

        int result = 0;

        for (int i = 1; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > numbers.get(i - 1) && numbers.get(i) > numbers.get(i + 1)) {
                result++;
            }
        }

        System.out.println(result);
    }
}
