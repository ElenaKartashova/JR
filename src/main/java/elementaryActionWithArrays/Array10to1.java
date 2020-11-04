package elementaryActionWithArrays;

//Заполнение массива из 10 чисел, числами от 10 до 1:
public class Array10to1 {

    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = 10 - i;
            System.out.println(numbers[i]);
        }
    }
}
