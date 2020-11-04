package arrays;

public class TwoArrayFor1000 {
    public static void main(String[] args) {
        int[] arrayOne = new int[900];
        int[] arrayTwo = new int[arrayOne.length];

        int s = 100;
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = s;
            s++;
        }
        for (int i = 0, j = arrayOne.length-1; i < arrayOne.length; i++, j--) {
            arrayTwo[j] = arrayOne[i];
        }

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println(arrayTwo[i]);
        }
    }
}
