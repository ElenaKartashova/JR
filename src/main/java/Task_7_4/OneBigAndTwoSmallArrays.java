package Task_7_4;

//1. Создать массив на 20 чисел.
//2. Ввести в него значения с клавиатуры.
//3. Создать два массива на 10 чисел каждый.
//4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
//
//Требования:
//•	Программа должна создавать большой массив на 20 целых чисел.
//•	Программа должна считывать с клавиатуры 20 чисел для большого массива.
//•	Программа должна создавать два маленьких массива на 10 чисел каждый.
//•	Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OneBigAndTwoSmallArrays {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        for (int i = 0; i < bigArray.length; i++) {
            int j = Integer.parseInt(reader.readLine());
            bigArray[i] = j;
        }
        System.arraycopy(bigArray, 0, smallArray1, 0, 10);
        System.arraycopy(bigArray, 10, smallArray2, 0, 10);

        for (int k = 0; k < smallArray2.length; k++) {
            System.out.println(smallArray2[k]);
        }
    }
}
