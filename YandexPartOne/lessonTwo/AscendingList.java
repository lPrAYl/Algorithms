package lessonTwo;
/*
    A. Возрастает ли список?
        Ограничение времени	1 секунда
        Ограничение памяти	64Mb
        Ввод	стандартный ввод или input.txt
        Вывод	стандартный вывод или output.txt
        Дан список. Определите, является ли он монотонно возрастающим(то есть верно ли, что каждый элемент этого списка больше предыдущего).

        Выведите YES, если массив монотонно возрастает и NO в противном случае.

        Пример 1
        Ввод	Вывод
        1 7 9
        YES
        Пример 2
        Ввод	Вывод
        1 9 7
        NO
        Пример 3
        Ввод	Вывод
        2 2 2
        NO
 */

import java.util.Scanner;
import java.util.stream.Stream;

public class AscendingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        if (isAscending(array)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isAscending(int[] array) {
        int length = array.length;

        for (int i = 1; i < length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
