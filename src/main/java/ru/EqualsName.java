package ru;
/*
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
        Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
        Если имена и длины имен разные - ничего не выводить.

        Требования:
        Программа должна считывать две строки c клавиатуры.
        Программа должна содержать System.out.println() или System.out.print()
        Если имена одинаковые вывести сообщение "Имена идентичны"
        Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
        Если имена и длины имен разные - ничего не выводить.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EqualsName {

    public static void main(String[] Args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();


        if (name1.equals(name2)) {
            System.out.print("Имена идентичны");
        }
         else if (name1.length()==name2.length()) {
            System.out.print("Длины имен равны");
         }

    }
}
