package elementaryActionWithArrays;

import java.io.IOException;

//Вывод массива на экран
public class OutputArrayToScreen {

    public static void main(String[] args) throws IOException {
        int[] list = new int[10];

        //заполнение массива
        for (int i = 0; i < list.length; i++)
            list[i] = i;

        //вывод на экран
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }
}
