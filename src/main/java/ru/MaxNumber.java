package ru;

/*
Задача по алгоритмам
*/
//Написать программу, которая:
//1. считывает с консоли число N, которое должно быть больше 0
//2. потом считывает N чисел с консоли
//3. выводит на экран максимальное из введенных N чисел.
//
//Требования:
//•	Программа должна считывать числа с клавиатуры.
//•	Программа должна выводить число на экран.
//•	В классе должен быть метод public static void main.
//•	Нельзя добавлять новые методы в класс Solution.
//•	Программа должна выводить на экран максимальное из введенных N чисел.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxNumber {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        System.out.println("Ввели N");
        int max = 0;
        System.out.println("Max пока равно 0");
        int i = 0; //это просто счетчик

        while (i < n) {
            int j = Integer.parseInt(reader.readLine()); //сюда вводим количество цифр n

            if /*(max == 0 || */( max < j) {
                max = j;
            }
            i++; //счетчик введенных чисел от, заданных в n
        }
        System.out.println(max);
    }
}

//сначала нужно считать число  int n = Integer.parseInt(reader.readLine()
//помимо int i = 0; объявить int max = 0;
//потом while (i < n) { ..... i++} ;
//а после уже вывести  System.out.println(max );

