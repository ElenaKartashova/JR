package task_7_4.Collections_7_9;

//1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//Порядок объявления списков очень важен.
//2. Метод printList должен выводить на экран все элементы списка с новой строки.
//3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
//
//Требования:
//•	Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
//•	Считать 20 чисел с клавиатуры и добавить их в главный список.
//•	Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
//•	Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
//•	Добавить в третий дополнительный список все остальные числа из главного.
//•	Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
//•	Программа должна вывести три дополнительных списка, используя метод printList.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
*/

public class Zolushka {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<Integer> listMain = new ArrayList<Integer>();
        ArrayList<Integer> listThree = new ArrayList<Integer>();
        ArrayList<Integer> listTwo = new ArrayList<Integer>();
        ArrayList<Integer> listOther = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 7; i++) {
            int s = Integer.parseInt(reader.readLine());
            listMain.add(s);
        }
        for (int i = 0; i < listMain.size(); i++) {
            if ((listMain.get(i) % 3 == 0) && (listMain.get(i) % 2 == 0)) {
                listThree.add(listMain.get(i));
                listTwo.add(listMain.get(i));
            } else if (listMain.get(i) % 3 == 0) {
                listThree.add(listMain.get(i));
            } else if (listMain.get(i) % 2 == 0) {
                listTwo.add(listMain.get(i));
            } else listOther.add(listMain.get(i));
        }
        printList(listMain);
        printList(listThree);
        printList(listTwo);
        printList(listOther);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
