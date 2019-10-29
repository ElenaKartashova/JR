package ru;

/* Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".

Требования:
•	Программа должна дважды считать данные c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст меньше 18 вывести только сообщение "Подрасти еще".
•	Если возраст больше либо равно 18 ничего не выводить. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NameAndAge {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваше имя");
        String name = reader.readLine();
        System.out.println("Введите ваш возраст");
        int age = Integer.parseInt(reader.readLine());

        if (age < 18) {
            System.out.print("Подрасти еще");
        }
    }
}
