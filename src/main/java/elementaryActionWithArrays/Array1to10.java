package elementaryActionWithArrays;

//Заполнение массива из 10 чисел, числами от 1 до 10:

public class Array1to10 {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
           numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }

    }
}
