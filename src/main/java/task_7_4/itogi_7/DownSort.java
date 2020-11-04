package task_7_4.itogi_7;

//Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
//
//Требования:
//•	Программа должна считывать 20 целых чисел с клавиатуры.
//•	Программа должна выводить 20 чисел.
//•	В классе Solution должен быть метод public static void sort(int[] array).
//•	Метод main должен вызывать метод sort.
//•	Метод sort должен сортировать переданный массив по убыванию.

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
В убывающем порядке
*/
public class DownSort {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }
    public static void sort(int[] array) { //Сортировка массива по убыванию. сортировка выбором
        //напишите тут ваш код
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] < array[k]) {
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
    }
}

//Шаги алгоритма:

//находим номер минимального значения в текущем списке
//производим обмен этого значения со значением первой неотсортированной позиции
//(обмен не нужен, если минимальный элемент уже находится на данной позиции)
//теперь сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы
//Для реализации устойчивости алгоритма необходимо в пункте 2 минимальный элемент
//непосредственно вставлять в первую неотсортированную позицию, не меняя порядок остальных элементов.
