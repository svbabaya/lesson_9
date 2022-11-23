/*
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
2. Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
3. Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
4. Порядок объявления списков очень важен.

5. Создай метод printList
6. Метод printList должен выводить на экран все элементы списка с новой строки.
7. Используя метод printList выведи эти три списка на экран.
8. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

package lesson_9_7;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arrayIn = new ArrayList<>();
        ArrayList<Integer> array3Div = new ArrayList<>();
        ArrayList<Integer> array2Div = new ArrayList<>();
        ArrayList<Integer> arrayOthers = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 20 целых чисел:");
        for (int i = 0; i < 20; i++) arrayIn.add(scan.nextInt());

        for (Integer arr : arrayIn) {
            if (arr % 3 == 0) array3Div.add(arr);
            if (arr % 2 == 0) array2Div.add(arr);
            if (arr % 3 != 0 && arr %2 != 0) arrayOthers.add(arr);
        }
        System.out.println();
        printList(array3Div);
        printList(array2Div);
        printList(arrayOthers);
    }

    static void printList(ArrayList<Integer> arr) {
        for (Integer s : arr) System.out.println(s);
        System.out.println();
    }
}
