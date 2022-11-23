/*
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

package lesson_9_4;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 10 строк:");
        for (int i = 0; i < 10; i++) arrayList.add(0, scan.nextLine());

        for (String s : arrayList) System.out.println(s);

    }
}
