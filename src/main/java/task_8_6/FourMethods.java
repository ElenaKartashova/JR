package task_8_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Реализовать 4 метода.
Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций
(быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.

Требования:
•	Программа не должна выводить текст на экран.
•	Класс Solution должен содержать только 5 методов.
•	Метод getListForGet должен возвращать список, который лучше всего подходит для операции взятия элемента.
•	Метод getListForSet должен возвращать список, который лучше всего подходит для установки значения элемента.
•	Метод getListForAddOrInsert должен возвращать список, который лучше всего подходит для операций добавления или вставки элемента.
•	Метод getListForRemove должен возвращать список, который лучше всего подходит для операции удаления элемента.
 */
/*
Квартет «Методы»
*/
public class FourMethods {
    public static ArrayList<String> list = new ArrayList<String>();

    public static List getListForGet() {
        //напишите тут ваш код
        ArrayList<String> AL = new ArrayList<String>();
        for (int i = 0; i < AL.size(); i++) {
            AL.get(i);
        }
        return AL;
    }

    public static List getListForSet() {
        //напишите тут ваш код
        ArrayList<String> AL = new ArrayList<String>();
        for (int i = 0; i < AL.size(); i++) {
            AL.set(i, "s");
        }
        return AL;
    }

    public static List getListForAddOrInsert() {
        //напишите тут ваш код
        LinkedList<String> LL = new LinkedList<String>();
        for (int i = 0; i < list.size(); i++) {
            LL.add(i, list.get(i));
        }
        return LL;
    }

    public static List getListForRemove() {
        //напишите тут ваш код
        LinkedList<String> LL = new LinkedList<String>();
        for (int i = 0; i < LL.size(); i++) {
            LL.remove(0);
        }
        return LL;
    }

    public static void main(String[] args) {

        list.add("Michael Jackson");
        list.add("Freddie Mercury");
        list.add("George Michael");
        list.add("Madonna");

        System.out.println(list.get(0));
        System.out.println(getListForGet());
        System.out.println(getListForSet());
        System.out.println(getListForAddOrInsert());
        System.out.println(getListForRemove());
    }
}
