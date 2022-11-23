/*
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

package lesson_9_1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        String str = "string";
        int size = 5;
        for (int i = 0; i < size; i++) arrayList.add(str + (int)(Math.random() * 10));
        System.out.println("Размер списка: " + arrayList.size());

        for (String s : arrayList) System.out.println(s);

    }

}
