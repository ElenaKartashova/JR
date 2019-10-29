package objects.Itogi6;

import java.util.Arrays;

//Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
//
//Пример ввода:
//3
//2
//15
//6
//17
//
//Пример вывода:
//2
//3
//6
//15
//17
//
//Требования:
//•	Программа должна считывать 5 чисел с клавиатуры.
//•	Программа должна выводить 5 чисел, каждое с новой строки.
//•	Выведенные числа должны быть отсортированы по возрастанию.
//•	Вывод должен содержать те же числа, что и были введены (порядок не важен).

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortNumbers {

    public static int i;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код

        int[] array = new int[5];

        for (i = 0; i < array.length; i++) {
            int j = Integer.parseInt(reader.readLine());
            array[i] = j;
        }
        Arrays.sort(array);
        for (int element : array) {
            System.out.println(element);
        }
        //String arrayString = Arrays.toString(array);
        //System.out.println(Arrays.toString(array));
        // Arrays.toString(array);
        //System.out.println(array);
    }
}