package ru;

// Ввести с клавиатуры три числа, вывести на экран среднее из них.
//Т.е. не самое большое и не самое маленькое.
//Если все числа равны, вывести любое из них.
//
//Требования:
//•	Программа должна считывать числа c клавиатуры.
//•	Программа должна выводить число на экран.
//•	Программа должна выводить среднее из трех чисел.
//•	Если все числа равны, вывести любое из них.
//•	Если два числа из трех равны, вывести любое из двух.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MediumNumber {

    public static void main (String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a < b && b < c) || (c < b && b < a)) {
            System.out.println(b);
        }
       else if ((b < a && a < c) || (c < a && a < b)) {
            System.out.println(a);
        }
        else if ((a < c && c < b) || (b < c && c < a)) {
            System.out.println(c);
        }
        else if (a==b && b==c) {
            System.out.println(b);
        }
        else if (a==b || a==c) {
           System.out.println(a);
        }
        else if (b==a || b==c) {
            System.out.println(b);
        }
        else if (c==a || b==c) {
            System.out.println(c);
        }

    }
}
