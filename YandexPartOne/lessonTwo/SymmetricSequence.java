package lessonTwo;

/*
    F. Симметричная последовательность
        Ограничение времени	1 секунда
        Ограничение памяти	64Mb
        Ввод	стандартный ввод или input.txt
        Вывод	стандартный вывод или output.txt
        Последовательность чисел назовем симметричной, если она одинаково читается как слева направо, так и справа налево. Например, следующие последовательности являются симметричными:

        1 2 3 4 5 4 3 2 1

        1 2 1 2 2 1 2 1

        Вашей программе будет дана последовательность чисел. Требуется определить, какое минимальное количество и каких чисел надо приписать в конец этой последовательности, чтобы она стала симметричной.

        Формат ввода
        Сначала вводится число N — количество элементов исходной последовательности (1 ≤ N ≤ 100). Далее идут N чисел — элементы этой последовательности, натуральные числа от 1 до 9.

        Формат вывода
        Выведите сначала число M — минимальное количество элементов, которое надо дописать к последовательности, а потом M чисел (каждое — от 1 до 9) — числа, которые надо дописать к последовательности.

        Пример 1
        Ввод	Вывод
        9
        1 2 3 4 5 4 3 2 1
        0
        Пример 2
        Ввод	Вывод
        5
        1 2 1 2 2
        3
        1 2 1
        Пример 3
        Ввод	Вывод
        5
        1 2 3 4 5
        4
        4 3 2 1
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SymmetricSequence {
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            sequence.add(scanner.nextInt());
        }

        int i = 0;
        int j = count - 1;

        while (i < j) {
            if (Objects.equals(sequence.get(i), sequence.get(j))) {
                j--;
            } else {
                j = count - 1;
            }

            i++;
        }

        if (j == (count - 1) / 2) {
            System.out.println(0);
        } else {
            System.out.println(j);
            StringBuilder result = new StringBuilder();

            for (i = j - 1; i > 0; i--) {
                result.append(sequence.get(i)).append(" ");
            }
            result.append(sequence.get(i));

            System.out.println(result);
        }
    }
}
