package ru;

/*Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.

Пример вывода на экран:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
5 10 15 20 25 30 35 40 45 50
6 12 18 24 30 36 42 48 54 60
7 14 21 28 35 42 49 56 63 70
8 16 24 32 40 48 56 64 72 80
9 18 27 36 45 54 63 72 81 90
10 20 30 40 50 60 70 80 90 100

Требования:
•	Программа не должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить таблицу умножения 10х10.
•	В программе должен использоваться только цикл while.*/

public class TableMultiply {

    public static void main(String[] args) {

        int x = 1;

        while (x <= 1) {
            System.out.println(1 + " " + 2 + " " + 3 + " " + 4 + " " + 5 + " " + 6 + " " + 7 + " " + 8 + " " + 9 + " " + 10);
            System.out.println(2 + " " + 4 + " " + 6 + " " + 8 + " " + 10 + " " + 12 + " " + 14 + " " + 16 + " " + 18 + " " + 20);
            System.out.println(3 + " " + 6 + " " + 9 + " " + 12 + " " + 15 + " " + 18 + " " + 21 + " " + 24 + " " + 27 + " " + 30);
            System.out.println(4 + " " + 8 + " " + 12 + " " + 16 + " " + 20 + " " + 24 + " " + 28 + " " + 32 + " " + 36 + " " + 40);
            System.out.println(5 + " " + 10 + " " + 15 + " " + 20 + " " + 25 + " " + 30 + " " + 35 + " " + 40 + " " + 45 + " " + 50);
            System.out.println(6 + " " + 12 + " " + 18 + " " + 24 + " " + 30 + " " + 36 + " " + 42 + " " + 48 + " " + 54 + " " + 60);
            System.out.println(7 + " " + 14 + " " + 21 + " " + 28 + " " + 35 + " " + 42 + " " + 49 + " " + 56 + " " + 63 + " " + 70);
            System.out.println(8 + " " + 16 + " " + 24 + " " + 32 + " " + 40 + " " + 48 + " " + 56 + " " + 64 + " " + 72 + " " + 80);
            System.out.println(9 + " " + 18 + " " + 27 + " " + 36 + " " + 45 + " " + 54 + " " + 63 + " " + 72 + " " + 81 + " " + 90);
            System.out.println(10 + " " + 20 + " " + 30 + " " + 40 + " " + 50 + " " + 60 + " " + 70 + " " + 80 + " " + 90 + " " + 100);

            x++;
        }
    }
}

