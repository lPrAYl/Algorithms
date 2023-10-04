package lessonTwo;

/*
    E. Чемпионат по метанию коровьих лепешек
        Ограничение времени	1 секунда
        Ограничение памяти	64Mb
        Ввод	стандартный ввод или input.txt
        Вывод	стандартный вывод или output.txt
        Ежегодный турнир «Веселый коровяк» — по метанию коровьих лепешек на дальность — прошел 8–9 июля в селе Крылово Осинского района Пермского края.

        Участники соревнований кидают «снаряд» — спрессованный навоз, выбирая его из заранее заготовленной кучи. Желающих поупражняться в силе броска традиционно очень много — как мужчин, так и женщин. Каждую лепешку, которую метнули участники «Веселого коровяка», внимательно осматривали женщины в костюмах коров и тщательно замеряли расстояние.

        Соревнования по метанию коровьих лепешек проводятся в Пермском крае с 2009 года.



        К сожалению, после чемпионата потерялись записи с фамилиями участников, остались только записи о длине броска в том порядке, в котором их совершали участники.

        Трактиорист Василий помнит три факта:

        1) Число метров, на которое он метнул лепешку, оканчивалось на 5

        2) Один из победителей чемпионата метал лепешку до Василия

        3) Участник, метавший лепешку сразу после Василия, метнул ее на меньшее количество метров

        Будем считать, что участник соревнования занял k-е место, если ровно (k − 1) участников чемпионата метнули лепешку строго дальше, чем он.

        Какое максимально высокое место мог занять Василий?

        Формат ввода
        Первая строка входного файла содержит целое число n — количество участников чемпионата по метанию лепешек (3 ≤ n ≤ 105).

        Вторая строка входного файла содержит n положительных целых чисел, каждое из которых не превышает 1000, — дальность броска участников чемпионата, приведенные в том порядке, в котором происходило метание.

        Формат вывода
        Выведите самое высокое место, которое мог занять тракторист Василий. Если не существует ни одного участника чемпионата, который удовлетворяет, описанным выше условиям, выведите число 0.

        Пример 1
        Ввод	Вывод
        7
        10 20 15 10 30 5 1
        6
        Пример 2
        Ввод	Вывод
        3
        15 15 10
        1
        Пример 3
        Ввод	Вывод
        3
        10 15 20
        0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShitChampionship {
    public static void main(String[] args) {
        List<Integer> listOfMember = new ArrayList<>();
        List<Integer> results = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int countOfMember = scanner.nextInt();

        for (int i = 0; i < countOfMember; i++) {
            listOfMember.add(scanner.nextInt());
        }

        int winner = listOfMember.stream().max(Integer::compare).get();

        for (int i = 0; i < countOfMember - 2; i++) {
            if (listOfMember.get(i) == winner && listOfMember.get(i + 1) % 10 == 5
                    && listOfMember.get(i + 2) < listOfMember.get(i + 1)) {
                results.add(listOfMember.get(i + 1));
            }
        }

        int position = 0;

        if (!results.isEmpty()) {
            position = 1;
            int bestResult = results.stream().max(Integer::compare).get();

            System.out.println(results.size());

            for (int i = 0; i < countOfMember; i++) {
                if (listOfMember.get(i) > bestResult) {
                    position++;
                }
            }
        }

        System.out.println(position);
    }
}