package ru;

public class Increment {

    public static void main(String[] args) {

        int x = 999;
        int y = x++;
        int z = x;
        System.out.println(y);
        System.out.println(x);
        System.out.println(z);
    }
}
