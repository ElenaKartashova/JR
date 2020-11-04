package arrays;

import java.util.Arrays;

public class TwoArray2 {

    public static void main(String[] args) {


        int[][] twoDimArray = new int[3][4];

        twoDimArray[0][0] = 5;//записали значение 5 в ячейку на пересечении нулевой строки и нулевого столбца
        twoDimArray[0][1] = 7; //записали значение 7 в ячейку на пересечении нулевой строки и первого столбца
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 17;
        twoDimArray[1][0] = 7;
        twoDimArray[1][1] = 0;
        twoDimArray[1][2] = 1;
        twoDimArray[1][3] = 12;
        twoDimArray[2][0] = 8;
        twoDimArray[2][1] = 1;
        twoDimArray[2][2] = 2;
        twoDimArray[2][3] = 3;


        System.out.println(twoDimArray[0][1]);


        int[][] two2DimArray = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};//объявили массив и заполнили его элементами
        for (int i = 0; i < 3; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + two2DimArray[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
        int[][] myArray = {{18,28,18},{28,45,90},{45,3,14}}; //быстрый вывод двумерного массива
        System.out.println(Arrays.deepToString(myArray));

        System.out.println(two2DimArray.length); //выводит число строк
        System.out.println(two2DimArray[2].length); //выводит число столбцов при любом индексе

    }
}
