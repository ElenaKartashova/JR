package ru;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumbersPolOtr {
    public static void main (String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double g = Integer.parseInt(reader.readLine());

        if (g%2==0 & (g/2)<0) {
            System.out.println("отрицательное четное число");
        }
        else if (g%2!=0 & (g/2)<0) {
            System.out.println("отрицательное нечетное число");
        }
        else if (g == 0) {
           System.out.println("ноль");
        }
        else if (g%2==0 & (g/2)>0) {
            System.out.println("положительное четное число");
        }
        else if (g%2!=0 & (g/2)>0) {
            System.out.println("положительное нечетное число");
        }
    }
}
