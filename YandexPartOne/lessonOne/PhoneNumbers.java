package lessonOne;
/*
    C. Телефонные номера
        Ограничение времени	1 секунда
        Ограничение памяти	64Mb
        Ввод	стандартный ввод или input.txt
        Вывод	стандартный вывод или output.txt
        Телефонные номера в адресной книге мобильного телефона имеют один из следующих форматов: +7<код><номер>, 8<код><номер>, <номер>, где <номер> — это семь цифр, а <код> — это три цифры или три цифры в круглых скобках. Если код не указан, то считается, что он равен 495. Кроме того, в записи телефонного номера может стоять знак “-” между любыми двумя цифрами (см. пример). На данный момент в адресной книге телефона Васи записано всего три телефонных номера, и он хочет записать туда еще один. Но он не может понять, не записан ли уже такой номер в телефонной книге. Помогите ему! Два телефонных номера совпадают, если у них равны коды и равны номера. Например, +7(916)0123456 и 89160123456 — это один и тот же номер.

        Формат ввода
        В первой строке входных данных записан номер телефона, который Вася хочет добавить в адресную книгу своего телефона. В следующих трех строках записаны три номера телефонов, которые уже находятся в адресной книге телефона Васи. Гарантируется, что каждая из записей соответствует одному из трех приведенных в условии форматов.

        Формат вывода
        Для каждого телефонного номера в адресной книге выведите YES (заглавными буквами), если он совпадает с тем телефонным номером, который Вася хочет добавить в адресную книгу или NO (заглавными буквами) в противном случае.

        Пример 1
        Ввод	Вывод
        8(495)430-23-97
        +7-4-9-5-43-023-97
        4-3-0-2-3-9-7
        8-495-430
        YES
        YES
        NO
        Пример 2
        Ввод	Вывод
        86406361642
        83341994118
        86406361642
        83341994118
        NO
        YES
        NO
        Пример 3
        Ввод	Вывод
        +78047952807
        +78047952807
        +76147514928
        88047952807
        YES
        NO
        YES
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phoneBook = new ArrayList<>();

        String newPhoneNumber = getPhoneNumber(scanner.next());

        for (int i = 0; i < 3; i++) {
            String oldPhoneNumber = getPhoneNumber(scanner.next());
            phoneBook.add(oldPhoneNumber);
        }

        phoneBook.forEach(number -> {
            if (newPhoneNumber.equals(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        });
    }

    private static String getPhoneNumber(String number) {
        String phoneNumber = number.replaceAll("-|\\(|\\)", "").replaceFirst("\\+7", "8");
        if (phoneNumber.length() == 7) {
            phoneNumber = "8495" + phoneNumber;
        }

        return phoneNumber;
    }
}
