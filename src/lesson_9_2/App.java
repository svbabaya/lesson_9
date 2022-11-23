/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/

package lesson_9_2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Добавьте 5 строк:");
        for (int i = 0; i < 5; i++) {
            arrayList.add(scan.nextLine());
        }
        System.out.println();

        int maxLength = arrayList.get(0).length();
        for (String s : arrayList) {
            if (s.length() > maxLength) maxLength = s.length();
        }

        System.out.println("Самые длинные строки:");
        for (String s : arrayList) {
            if (s.length() == maxLength) System.out.println(s);
        }

    }
}
