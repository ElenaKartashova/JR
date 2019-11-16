package Task_8_11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки.

Требования:
•	Программа должна выводить текст на экран.
•	Внутри класса Solution должны быть созданы public static классы Cat, Dog.
•	Метод createCats() класса Solution должен возвращать множество (Set) содержащее 4 кота.
•	Метод createDogs() класса Solution должен возвращать множество (Set) содержащее 3 собаки.
•	Метод join() класса Solution должен возвращать объединенное множество всех животных - всех котов и собак.
•	Метод removeCats() должен удалять из множества pets всех котов, которые есть в множестве cats.
•	Метод printPets() должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.
 */
/*
Множество всех животных
*/
public class SetAllPets {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println("\n");
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> resultC = new HashSet<Cat>();
        //напишите тут ваш код
        while (resultC.size() < 4) {
            Cat cat = new Cat();
            resultC.add(cat);
        }
        return resultC;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> resultD = new HashSet<Dog>();
        while (resultD.size() < 3) {
            Dog dog = new Dog();
            resultD.add(dog);
        }
        return resultD;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> petsUnion = new HashSet<Object>();
        petsUnion.addAll(cats);
        petsUnion.addAll(dogs);
        return petsUnion;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код

        for (Object p : pets) {
            System.out.println(p);
        }
    }

    //напишите тут ваш код
    public static class Cat {
        public Cat() {
        }
    }

    public static class Dog {
        public Dog() {
        }
    }
}
