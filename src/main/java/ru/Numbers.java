package ru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a==b) {
            System.out.println(3);
        }
        else  if (a==c){
            System.out.println(2);
        }
        else if (b==c) {
            System.out.println(1);
        }
    }
}
