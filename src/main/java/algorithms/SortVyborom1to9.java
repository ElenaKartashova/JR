package algorithms;

//сортировка выбором по возрастанию

public class SortVyborom1to9 {

    public static void main(String[] args) {

        int[] array = {9, 4, 7, 2, 6, 5, 1, 3, 8}; //9

        for (int i = 0; i < array.length - 1; i++) {
            int least = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[i];
            array[i] = array[least];
            array[least] = tmp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

//Сортировка выбором (Selection Sort)
//Другая сортировка — сортировка выбором. Она также имеет квадратичную сложность, но об этом чуть позже.
//
//Итак, идея простая. Каждый проход выбирать самый минимальный элемент и смещать его в начало.
// При этом каждый новый проход начинать сдвигаясь вправо, то есть первый проход — с первого элемента,
// второй проход — со второго. Выглядеть это будет следующим образом: