package Task_7_4;

//1. Создать массив на 15 целых чисел.
//2. Ввести в него значения с клавиатуры.
//3. Пускай индекс элемента массива является номером дома, а значение - число жителей, проживающих в доме.
//Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
//4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."
//
//Примечание:
//дом с порядковым номером 0 считать четным.
//
//Требования:
//•	Программа должна создавать массив на 15 целых чисел.
//•	Программа должна считывать числа для массива с клавиатуры.
//•	Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
//•	Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreetsAndHouses {

    static int i;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] house = new int[15];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < house.length; i++) {
            int j = Integer.parseInt(reader.readLine());
            house[i] = j;

            if (i % 2 == 0) {
                sum1 += j;
            } else if (i % 2 != 0) {
                sum2 += j;
            }
        }
        if (sum1 > sum2) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
