package task_7_4.Collections_7_9;

import java.util.ArrayList;
import java.util.ListIterator;

public class ROreL2 {
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

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ListIterator<String> iterator = strings.listIterator();
        ArrayList<String> list = new ArrayList<String>();
        String r = "р";
        String l = "л";

            while (iterator.hasNext()) {
                String value = iterator.next();
                if (value.contains(r) && value.contains(l)) {
                    return strings;
                } else if (value.contains(l)) {
                    list.add(value);
                } else if (value.contains(r)) {
                    list.remove(value);
                }
            }

        return list;
    }

}


