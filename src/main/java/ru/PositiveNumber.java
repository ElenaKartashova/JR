package ru;

//Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
//Требования:
//•	Программа должна считывать числа c клавиатуры.
//•	Программа должна выводить число на экран.
//•	Программа должна выводить количество положительных чисел в исходном наборе.
//•	Если положительных чисел нет, программа должна вывести "0".
//•	Учти, что "0" не относится ни к положительным, ни к отрицательным числам.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PositiveNumber {

    public static void main (String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a > 0 && b > 0 && c > 0) {
            System.out.println("3");
        }
        else if ((a > 0 && b > 0 && c <= 0) || (a > 0 && b <= 0 && c > 0) || (a <= 0 && b > 0 && c > 0))  {
            System.out.println("2");
        }
        else if ((a > 0 && b <= 0 && c <= 0) || (a <= 0 && b > 0 && c <= 0) || (a <= 0 && b <= 0 && c > 0)) {
            System.out.println("1");
        }
        else if (a <= 0 && b <= 0 && c <= 0) {
            System.out.println("0");
        }
    }
}
