package arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 3};

        // Вывести массив на экран
        for (int element : myList) {
            System.out.println(element);
        }
    }
    int[] cats = new int[20]; // массив - фиксированный размер, ArrayList - размер динамический

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
