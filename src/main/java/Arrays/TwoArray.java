package Arrays;

public class TwoArray {

    TwoArray (String name){
    }
    public static void main(String[] args) {

         TwoArray[][] cats = new TwoArray[3][5];
        cats[1][2] = new TwoArray("Пушок");

        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j < cats[i].length; j++) {
                System.out.println(cats[i][j]);
            }
        }
    }
}
