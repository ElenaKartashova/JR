package Task_7_4.Collections_7_9;

//1. Создай список слов, заполни его самостоятельно.
//2. Метод fix должен:
//2.1. удалять из списка строк все слова, содержащие букву "р"
//2.2. удваивать все слова содержащие букву "л".
//2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
//2.4. с другими словами ничего не делать.
//
//Пример:
//роза
//лира
//лоза
//
//Выходные данные:
//лира
//лоза
//лоза
//
//Требования:
//•	Программа не должна считывать данные с клавиатуры.
//•	Метод fix должен удалять из списка строк все слова, содержащие букву "р". Исключение: слова содержащие и букву "р" и букву "л" - их нужно оставить.
//•	Метод fix должен удваивать слова, содержащие букву "л" (добавлять еще один элемент с этим словом). Исключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
//•	Метод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
//•	Метод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".

/*
Р или Л
*/
import java.util.ArrayList;
import java.util.ListIterator;

public class ROreL {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> Strings) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        String r = "р";
        String l = "л";
        for (String world : Strings) { //foreach
            if (world.contains(r) && world.contains(l)) {  //лира
                list.add(world);
            } else if (world.contains(r)) {  //роза, мера
            } else if (world.contains(l)) {  //лоза
                list.add(world);
                list.add(world);
            } else {
                list.add(world); // вода
            }
        }
        return list;
    }
}

