package lessonTwo;
/*
    B. Определить вид последовательности
        Ограничение времени	1 секунда
        Ограничение памяти	64Mb
        Ввод	стандартный ввод или input.txt
        Вывод	стандартный вывод или output.txt
        По последовательности чисел во входных данных определите ее вид:

        CONSTANT – последовательность состоит из одинаковых значений
        ASCENDING – последовательность является строго возрастающей
        WEAKLY ASCENDING – последовательность является нестрого возрастающей
        DESCENDING – последовательность является строго убывающей
        WEAKLY DESCENDING – последовательность является нестрого убывающей
        RANDOM – последовательность не принадлежит ни к одному из вышеупомянутых типов
        Формат ввода
        По одному на строке поступают числа последовательности ai, |ai| ≤ 109.

        Признаком окончания последовательности является число -2× 109. Оно в последовательность не входит.

        Формат вывода
        В единственной строке выведите тип последовательности.

        Пример
        Ввод	Вывод
        -530
        -530
        -530
        -530
        -530
        -530
        -2000000000
        CONSTANT
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceType {
    public static void main(String[] args) {
        int n;
        List<Integer> sequence = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while ((n = scanner.nextInt()) != -2_000_000_000) {
            sequence.add(n);
        }

        Type type = findTypeOfSequence(sequence.stream().mapToInt(Integer::intValue).toArray());

        switch (type) {
            case RANDOM :
                System.out.println("RANDOM");
                break;
            case CONSTANT :
                System.out.println("CONSTANT");
                break;
            case ASCENDING :
                System.out.println("ASCENDING");
                break;
            case WEAKLY_ASCENDING :
                System.out.println("WEAKLY ASCENDING");
                break;
            case DESCENDING :
                System.out.println("DESCENDING");
                break;
            case WEAKLY_DESCENDING :
                System.out.println("WEAKLY DESCENDING");
                break;
        }
    }

    enum Type {
        CONSTANT,
        ASCENDING,
        WEAKLY_ASCENDING,
        DESCENDING,
        WEAKLY_DESCENDING,
        RANDOM
    }

    private static Type findTypeOfSequence(int[] sequence) {
        boolean containsEqualsNumber = false;
        Type type = Type.CONSTANT;

        if (sequence.length == 1) {
            return type;
        }

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] == sequence[i - 1] ) {
                containsEqualsNumber = true;
            }
            if (sequence[i] > sequence[i - 1]) {
                if (type == Type.DESCENDING) {
                    return Type.RANDOM;
                }

                type = Type.ASCENDING;
            } else if (sequence[i] < sequence[i - 1]){
                if (type == Type.ASCENDING) {
                    return Type.RANDOM;
                }

                type = Type.DESCENDING;
            }
        }

        if (type == Type.ASCENDING && containsEqualsNumber) {
            type = Type.WEAKLY_ASCENDING;
        }

        if (type == Type.DESCENDING && containsEqualsNumber) {
            type = Type.WEAKLY_DESCENDING;
        }

        return type;
    }
}
