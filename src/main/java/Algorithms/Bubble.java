package Algorithms;

//сортировка пузырьком
public class Bubble {
    public static void main(String[] args) {
        int[] array = {12, 4, 91, 49, 28, 1969, 26, 1981, 21, 14, 1950};

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
