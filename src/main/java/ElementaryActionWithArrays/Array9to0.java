package ElementaryActionWithArrays;

//Заполнение массива из 10 чисел, числами от 9 до 0:

public class Array9to0 {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 9 - i;
            System.out.println(numbers[i]);
        }
    }
}
