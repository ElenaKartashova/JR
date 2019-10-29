package ru;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sortirovka {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

       {
            /*int[] array = new int[]{a,b,c};
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));*/

            if (a>=b & a>=c & b>=c) {
                System.out.println(a + " " + b + " " + c);
            }
            else if (b>=a & b>=c & a>=c) {
                System.out.println(b + " " + a + " " + c);
            }
            else if (c>=a & c>=b & a>=b) {
                System.out.println(c + " " + a + " " + b);
            }
            else if (c>=a & c>=b & b>=a) {
                System.out.println(c + " " + b + " " + a);
            }
            else if (b>=a & b>=c & c>=a) {
                System.out.println(b + " " + c + " " + a);
            }
            else if (a>=c & a>=b & c>=b) {
                System.out.println(a + " " + c + " " + b);
            }
        }

    }
}
