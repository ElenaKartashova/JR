package task_7_4;

import java.util.ArrayList;
/*
Что за список такой?
*/
//1. Создай список строк.
//2. Добавь в него 5 различных строк.
//3. Выведи его размер на экран.
//4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
//
//Требования:
//•	Программа не должна ничего считывать с клавиатуры.
//•	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
//•	Программа должна добавить 5 любых строк в список.
//•	Программа должна вывести размер списка на экран.
//•	Программа должна вывести содержимое списка на экран, каждое значение с новой строки.

public class ListOne {
    public static void main(String[] args) {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "Michael JAckson");
        list.add(1, "George Michael");
        list.add(2, "Freddie Mercury");
        list.add(3, "Madonna");
        list.add(4, "Земфира");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
