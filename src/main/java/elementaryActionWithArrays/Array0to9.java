package elementaryActionWithArrays;

//Заполнение массива из 10 чисел, числами от 0 до 9:
public class Array0to9 {

    public static void main(String[] args)
    {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
    }
}
