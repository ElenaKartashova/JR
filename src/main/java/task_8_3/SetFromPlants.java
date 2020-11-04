package task_8_3;

//Создать коллекцию Set (реализация HashSet) с типом элементов String.
//Добавить в неё 10 строк:
//арбуз
//банан
//вишня
//груша
//дыня
//ежевика
//женьшень
//земляника
//ирис
//картофель
//
//Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//Посмотреть, как изменился порядок добавленных элементов.
//
//Требования:
//•	Объяви переменную коллекции Set с типом элементов String и сразу проинициализируй ee.
//•	Программа не должна считывать строки с клавиатуры.
//•	Программа должна добавлять в коллекцию 10 строк, согласно условию.
//•	Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.

///*
//Set из растений
//*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetFromPlants {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }
    }
}

  /*for (String text: set) {
            System.out.println(text);
        }*/
