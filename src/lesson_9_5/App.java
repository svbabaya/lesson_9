/*
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
*/

package lesson_9_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) linkedList.add(scan.nextLine());

        String str = "";
        for (int i = 0; i < 13; i++) {
            str = linkedList.getLast();
            linkedList.remove(linkedList.size() - 1);
            linkedList.add(0, str);
        }

        for (String s : linkedList) System.out.println(s);

    }
}
