package ru;

// Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.
//
//Пример вывода на экран для имени Света:
//Света любит меня.
//Света любит меня.
//Света любит меня.
//Света любит меня.
//Света любит меня.
//Света любит меня.
//Света любит меня.
//Света любит меня.
//Света любит меня.
//Света любит меня.
//
//Требования:
//•	Программа должна считывать имя c клавиатуры.
//•	Программа должна выводить текст на экран.
//•	Программа должна выводить 10 раз текст указанный в задании.
//•	В программе должен использоваться цикл for.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CicleSeven {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }
}
