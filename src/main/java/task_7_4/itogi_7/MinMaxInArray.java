package task_7_4.itogi_7;

//Создать массив на 20 чисел.
//Заполнить его числами с клавиатуры.
//Найти максимальное и минимальное числа в массиве.
//Вывести на экран максимальное и минимальное числа через пробел.
//
//Требования:
//•	Создай массив целых чисел (int[]) на 20 элементов.
//•	Считай с клавиатуры 20 целых чисел и добавь их в массив.
//•	Найди и выведи через пробел максимальное и минимальное числа.
//•	Используй цикл for.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

///*
//Минимаксы в массивах
//*/

public class MinMaxInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int minimum;

        //напишите тут ваш код

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            int nums = Integer.parseInt(reader.readLine());
            numbers[i] = nums;
        }
        maximum = numbers[0];
        minimum = numbers[4];

        for (int i = numbers.length-1; i>=0; i--) {
            if (numbers[i] < minimum ) {
                minimum = numbers[i];
            }
        }
        for (int i = 1; i < numbers.length; i++) {
            if (maximum < numbers[i]) {
                maximum = numbers[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }
}

