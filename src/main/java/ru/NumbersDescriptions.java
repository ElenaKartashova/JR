package ru;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

public class NumbersDescriptions {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(reader.readLine());

        if (d % 2 == 0 && d > 0 && d < 10) {
            System.out.println("четное однозначное число");
        } else if (d % 2 != 0 && d > 0 && d < 10) {
            System.out.println("нечетное однозначное число");
        } else if (d % 2 == 0 && d > 9 && d < 100) {
            System.out.println("четное двузначное число");
        } else if (d % 2 != 0 && d > 9 && d < 100) {
            System.out.println("нечетное двузначное число");
        } else if (d % 2 == 0 && d > 99 && d < 1000) {
            System.out.println("четное трехзначное число");
        } else if (d % 2 != 0 && d > 99 && d < 1000) {
            System.out.println("нечетное трехзначное число");
        }
    }
}

