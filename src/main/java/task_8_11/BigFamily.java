package task_8_11;

import java.util.ArrayList;

/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).

Требования:
•	Программа должна выводить текст на экран.
•	Класс Human должен содержать четыре поля.
•	Класс Human должен содержать один метод.
•	Класс Solution должен содержать один метод.
•	Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
 */
/*
Собираем семейство
*/
public class BigFamily {
    public static void main(String[] args) {
        //напишите тут ваш код

        ArrayList<Human> family = new ArrayList<Human>();
        ArrayList<Human> grand = new ArrayList<Human>();
        ArrayList<Human> parentsF = new ArrayList<Human>();
        ArrayList<Human> parentsM = new ArrayList<Human>();
        ArrayList<Human> child = new ArrayList<Human>();

        child.add(new Human("kid1", true, 3, new ArrayList<Human>()));
        child.add(new Human("kid2", true, 4, new ArrayList<Human>()));
        child.add(new Human("kid3", false, 5, new ArrayList<Human>()));

        parentsF.add(new Human("Father", true, 25, child));
        parentsM.add(new Human("Mother", false, 25, child));

        grand.add(new Human("дедушка1", true, 50, parentsF));
        grand.add(new Human("дедушка2", true, 50, parentsM));
        grand.add(new Human("бабушка1", false, 50, parentsF));
        grand.add(new Human("бабушка2", false, 50, parentsM));

        family.addAll(grand);
        family.addAll(parentsF);
        family.addAll(parentsM);
        family.addAll(child);

        for (Human item : family) {
            System.out.println(item);
        }
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
