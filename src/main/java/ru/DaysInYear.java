package ru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaysInYear {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if(a % 400 == 0){
            System.out.println("количество дней в году: 366");
        }else if(a % 100 == 0){
            System.out.println("количество дней в году: 365");
        }else if( a % 4 == 0){
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}
