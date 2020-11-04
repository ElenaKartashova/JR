package arrays;
import java.util.Arrays;

public class ArraysExmp {

    static int[] intArray1 = new int[5];
   static int[] intArray = {1, 9, 7, 4, 5};
    static String[] stringArray = new String[5];
    static boolean[] booleansArray = new boolean[5];
    static Object[] objectsArray = new Object[7];
    //Инициализация массива — это заполнение его конкретными данными (не по умолчанию).
    static String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};
    static Object[] album = {"OffTheWall", "Thriller", "Bad", "Dangerous", "History"};


    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons[i]);
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(album[j]);
        }
        Arrays.sort(intArray, 0, 5);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArray1));

        Arrays.sort(album, 0, 5);
        System.out.println(Arrays.toString(album)); //отсортированы альбомы по алфавиту

        System.out.println(intArray[1]);
        System.out.println(stringArray[2]);
        System.out.println(booleansArray[3]);
        System.out.println(objectsArray[6]);

        System.out.println(intArray.length);
        System.out.println(stringArray.length);
        System.out.println(booleansArray.length);
        System.out.println(objectsArray.length);

        System.out.println(seasons[1]);
        System.out.println(album[2]); // вывод альбомов, отсортированных по алфавиту



        String birthdays [] = new String[10];
        birthdays[0] = "Лена Елисеева, 12 марта";
        birthdays[1] = "Коля Романов, 18 мая";
        birthdays[7] = "Олеся Остапенко, 3 января";

        String olesyaBirthday = birthdays[7];
        System.out.println(olesyaBirthday);
    }
}