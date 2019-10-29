package ru;

/*Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.

Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS

Требования:
•	Программа не должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить квадрат из 10х10 букв S.
•	В программе должен использоваться цикл while.*/

public class Quadrate {

    public static void main(String[] args) {

        int x = 0;

        while (x<10) {
            System.out.print("S");
            System.out.print("S");
            System.out.print("S");
            System.out.print("S");
            System.out.print("S");
            System.out.print("S");
            System.out.print("S");
            System.out.print("S");
            System.out.print("S");
            System.out.print("S");
            System.out.println();
            x++;
        }
    }
}
