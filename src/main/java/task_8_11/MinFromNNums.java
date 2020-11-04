package task_8_11;
/*
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать только три метода.
•	Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
•	Метод getMinimum() должен вернуть минимальное число среди элементов списка.
•	Метод main() должен вызывать метод getIntegerList().
•	Метод main() должен вызывать метод getMinimum().
 */

/*
Минимальное из N чисел
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MinFromNNums {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(integerList);
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут

        int  minimum = array.get(0);
        for (int j = 0; j < array.size(); j++)
        {
            if (array.get(j) <= minimum){
                minimum = array.get(j);
            }
        }
        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        List<Integer> integerList = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; integerList.size() < N; i++) {
            int M = Integer.parseInt(reader.readLine());
            integerList.add(M);
        }
        return integerList;
    }
}
