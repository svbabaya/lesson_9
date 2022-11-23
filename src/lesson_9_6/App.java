/*
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из пункта 3. Должна быть выведена одна строка.
*/

package lesson_9_6;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 10 строк:");
        for (int i = 0; i < 10; i++) arrayList.add(scan.nextLine());

        int minLength = arrayList.get(0).length();
        int maxLength = minLength;

        for (String s : arrayList) {
            if (s.length() < minLength) minLength = s.length();
            if (s.length() > maxLength) maxLength = s.length();
        }

        for (String s : arrayList) {
            if (s.length() == minLength) {
                System.out.println("Первой встретилась короткая строка: " + s);
                break;
            }
            if (s.length() == maxLength) {
                System.out.println("Первой встретилась длинная строка: " + s);
                break;
            }
        }
    }
}

