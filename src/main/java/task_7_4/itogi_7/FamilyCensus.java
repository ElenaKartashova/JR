package task_7_4.itogi_7;

//Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
// Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
//
//Примечание:
//Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
//
//Пример вывода:
//Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
//Имя: Катя, пол: женский, возраст: 55
//Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
//...
//
//Требования:
//•	Программа не должна считывать данные с клавиатуры.
//•	Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
//•	Добавить в класс конструктор public Human(String name, boolean sex, int age).
//•	Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
//•	Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
//•	Выведи созданные объекты на экран.

///*
//Семейная перепись
//*/
public class FamilyCensus {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human GrandmotherNatasha = new Human("Наташа", false, 65);
        Human GrandmotherAlexandra = new Human("Александра", false, 62);
        Human GrandfatherGeorge = new Human("Егор", true, 67);
        Human GrandfatherMichael = new Human("Михаил", true, 69);

        Human lena = new Human("Лена", false, 38, GrandfatherGeorge, GrandmotherNatasha);
        Human natasha = new Human("Наталья", false, 49, GrandfatherGeorge, GrandmotherNatasha);
        Human sasha = new Human("Саша", true, 27, GrandfatherMichael, GrandmotherAlexandra);
        Human pasha = new Human("Паша", true, 28, GrandfatherMichael, GrandmotherAlexandra);
        Human tanya = new Human("Таня", true, 40, GrandfatherMichael, GrandfatherMichael);

        System.out.println(GrandmotherNatasha);
        System.out.println(GrandmotherAlexandra);
        System.out.println(GrandfatherGeorge);
        System.out.println(GrandfatherMichael);

        System.out.println(lena);
        System.out.println(natasha);
        System.out.println(sasha);
        System.out.println(pasha);
        System.out.println(tanya);
    }

    public static class Human {
        // напишите тут ваш код

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

       /* public Human getFather() {
            return father;
        }

        public void setFather(Human father) {
            this.father = father;
        }

        public Human getMother() {
            return mother;
        }

        public void setMother(Human mother) {
            this.mother = mother;
        }*/

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский"); //тернарная функция
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
