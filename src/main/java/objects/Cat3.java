package objects;

/*
Конструируем котиков
*/
//Создать класс Cat (кот) с пятью конструкторами:
//- Имя,
//- Имя, вес, возраст
//- Имя, возраст (вес стандартный)
//- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
//- вес, цвет, адрес (чужой домашний кот)
//
//Задача конструктора - сделать объект валидным.
//Например, если вес не известен, то нужно указать какой-нибудь средний вес.
//Кот не может ничего не весить.
//То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
//
//Требования:
//У класса Cat должна быть переменная name с типом String.
//У класса Cat должна быть переменная age с типом int.
//У класса Cat должна быть переменная weight с типом int.
//У класса Cat должна быть переменная address с типом String.
//У класса Cat должна быть переменная color с типом String.
//У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
//У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
//У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
//У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
//У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
public class Cat3 {
//напишите тут ваш код

    String name = null;
    int age = 3;
    int weight = 2;
    String address = null;
    String color = "red";

    public Cat3(String name) {
        this.name = name;
        this.age = 3;
        this.weight = weight;
        this.color = color;
    }

    public Cat3(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Cat3(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Cat3(int weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Cat3(int weight, String color, String address) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }

}
