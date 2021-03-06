package algorithms;

//Сортировка массива по убыванию. сортировка выбором
public class SortVyborom9to1 {
    public static void main(String[] args) {

        int[] array = {9, 4, 7, 2, 6, 5, 1, 3, 8};

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i] < array[k]) {
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

//Шаги алгоритма:

//находим номер минимального значения в текущем списке
//производим обмен этого значения со значением первой неотсортированной позиции
//(обмен не нужен, если минимальный элемент уже находится на данной позиции)
//теперь сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы
//Для реализации устойчивости алгоритма необходимо в пункте 2 минимальный элемент
//непосредственно вставлять в первую неотсортированную позицию, не меняя порядок остальных элементов.