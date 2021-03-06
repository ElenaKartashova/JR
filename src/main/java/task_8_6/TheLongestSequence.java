package task_8_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

Требования:
•	Программа должна выводить число на экран.
•	Программа должна считывать значения с клавиатуры.
•	В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
•	Программа должна добавлять в коллекцию 10 чисел, согласно условию.
•	Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
 */
/*
Cамая длинная последовательность
*/
public class TheLongestSequence {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int s = Integer.parseInt(reader.readLine());
            nums.add(s);
        }

        System.out.print(nums.get(0) + ", ");
        System.out.print(nums.get(1) + ", ");
        System.out.print(nums.get(2) + ", ");
        System.out.print(nums.get(3) + ", ");
        System.out.print(nums.get(4) + ", ");
        System.out.print(nums.get(5) + ", ");
        System.out.print(nums.get(6) + ", ");
        System.out.print(nums.get(7) + ", ");
        System.out.print(nums.get(7) + ", ");
        System.out.println(nums.get(9));


        int sum = 1;
        int sum2 = 1;
        for (int i = 1; i < 10; i++) {
            if (nums.get(i - 1).equals(nums.get(i))) {
                sum++;
            } else if (sum >= sum2) {
                sum2 = sum;
                sum = 1;
            }
        }
        if (sum2 == sum) {
            System.out.println(sum2);
        } else System.out.println(Math.max(sum2, sum));
    }
}

