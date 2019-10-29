package ru;

import java.io.*;
import static sun.swing.MenuItemLayoutHelper.max;

public class MinAB {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       /* String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        String d = reader.readLine(); */

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        System.out.println(max(a,b,c,d));

       /* if ((a>b) & (a>c) & (a>d))  {
            System.out.println(a);
        }

        else if ((b>a) & (b>c) & (b>d)) {
            System.out.println(b);
        }

        else if ((c>a) & (c>b) & (c>d)) {
            System.out.println(c);
        }

        else if ((d>a) & (d>c) & (d>b)) {
            System.out.println(d);
        }

       else {
            System.out.println(max(a,b,c,d));
        }*/

    }
    }

