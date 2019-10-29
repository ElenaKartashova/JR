package ru;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        /*Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 400 == 0 || year % 4 == 0)
        {
            System.out.println("количество дней в году: 366"); }
        else
            if (year % 100 == 0 || year % 400 != 0)
        {
            System.out.println("количество дней в году: 365"); }*/
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String a = reader.readLine();
                String b = reader.readLine();
                String c = reader.readLine();

        /*Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();*/

        if (Objects.equals(a, b) & Objects.equals(a, c)) {
            System.out.print(a + " " + a + " " + a);
        } else if (Objects.equals(a, b) || Objects.equals(a, c)) {
            System.out.print(a + " " + a);
        } else if (Objects.equals(c, b)) {
            System.out.print(b + " " + b);
        }


                /*double a = Integer.parseInt(num);
                double b = a % 5;
                if (b>=0 && b<3){System.out.println("зелёный");}
                else if (b>=3 && b<4) {System.out.println("жёлтый");}
                else if (b>=4 && b<5) {System.out.println("красный");}*/

    }
}
