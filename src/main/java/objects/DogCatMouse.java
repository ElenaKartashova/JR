package objects;

/*
Том и Джерри
*/
//Создай классы Dog, Cat, Mouse.
//Добавь по три поля в каждый класс, на твой выбор.
//Создай объекты для героев мультика Том и Джерри.
//Так много, как только вспомнишь.
//
//Пример:
//Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
//где 12 - высота в см,
//5 - длина хвоста в см.
//
//Требования:
//•	Создай класс Dog.
//•	Создай класс Cat.
//•	В классе Dog должно быть три переменные.
//•	В классе Cat должно быть три переменные.
//•	Должен быть создан хотя бы один объект типа Mouse.
//•	Должен быть создан хотя бы один объект типа Dog.
//•	Должен быть создан хотя бы один объект типа Cat.

public class DogCatMouse {

    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Cat tomCat = new Cat("Tom", 5, "black");
        Dog artemonDog = new Dog("Artemon", 3, "poodle");

        System.out.println(jerryMouse.name);
        System.out.println(tomCat.color);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код

    public static class Cat {
        String name;
        int age;
        String color;

        public Cat(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }

    public static class Dog {
        String name;
        int age;
        String breed; //порода

        public Dog(String name, int age, String breed) {
            this.name = name;
            this.age = age;
            this.breed = breed;
        }
    }
}
