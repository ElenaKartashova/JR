package Arrays;

public class Array4 {

    public static void main(String[] args) {
        String[] list = new String[5];

        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
        System.out.println(list[3]);
        System.out.println(list[4]);

        int listCount = list.length;

        list[1] = "Mama";
        String s = list[1];

        for (int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);
        }
        System.out.println(listCount);
    }
}
