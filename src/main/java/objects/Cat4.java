package objects;

import java.lang.*;

//Реализовать метод boolean fight(Cat anotherCat):
//реализовать механизм драки котов в зависимости от их веса, возраста и силы.
//Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
//Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет. Если ничья и никто не выиграл, возвращаем false
//
//Должно выполняться условие:
//если cat1.fight(cat2) возвращает true,
//то cat2.fight(cat1) должен возвращать false
//
//Требования:
//•	Класс Cat должен содержать конструктор без параметров.
//•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
//•	В классе Cat должен быть метод fight.
//•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы.
//•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
//•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
//•	Если ничья, то метод fight должен возвращать false.
//• Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.


public class Cat4 {

    int age;
    int weight;
    int strength;

    public Cat4() {

    }

    public boolean fight(Cat4 anotherCat) {
        //напишите тут ваш код
        anotherCat.age = 2;
        anotherCat.weight = 3;
        anotherCat.strength = 4;

        Cat4 cat = new Cat4();
        cat.age = 1;
        cat.weight = 2;
        cat.strength = 3;

        int sum1 = anotherCat.age + anotherCat.weight + anotherCat.strength;
        int sum2 = cat.age + cat.weight + cat.strength;

        if (sum1 > sum2) {
            return true;
        } else
            return false;

    }
        public static void main (String[]args){

        }

    }




