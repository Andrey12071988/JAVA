/*
* статья по работе со списком
* https://javarush.com/groups/posts/2354-arraylist-v-java
*/

import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;

public class program_01 {

    public static void main(String[] args) { // Точка входа в программу

        int[] list = { 1, 9, 9, 0, 2, 8, 0, 9 }; // Задан массив чисел
        List<Integer> listout1 = new ArrayList<Integer>(); // создание пустого списка значений
        List<Integer> listout2 = new ArrayList<Integer>(); // создание пустого списка количества значений
        int a = 1;

        // Составление частотного словаря из массива
        for (int i = 0; i < list.length; i++) {
            //поиск элемента массива list[i] в списке listout1
            int position = search(listout1, list[i]);
            if (position >= 0) {
                // увеличение кол-ва повторений элемента в позиции на 1
                listout2.set(position, listout2.get(position) + 1);
            } else {
                //добавление нового элемента в listout1 и количество повторений (1) в listout2
                listout1.add(list[i]);
                listout2.add(a);
            }
        }

        // Вывод частотного словаря в терминал через цикл
        for (int i = 0; i < listout1.size(); i++) {
            System.out.printf("%d: %d \n", listout1.get(i), listout2.get(i));
        }

    }

    // поиск числа в списке или массиве
    private static int search(List<Integer> arr, int num) {
        /*
         * arr.size() - получение размера массива
         * arr.get(i) - получение элемента по индексу i
         */
        int pos = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == num) {
                return pos = i;
            }
        }
        return pos;
    }
}
