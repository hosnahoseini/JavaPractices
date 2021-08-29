package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, temp;
        Scanner get = new Scanner(System.in);
        a = get.nextInt();
        b = get.nextInt();


        while (a != 0) {
            temp = a;
            a = b % a;
            b = temp;
        }
        if (b == 1)
            System.out.println("nesbat be ham aval hastan");
        else
            System.out.println("nesbat be ham aval nistan");

    }
}
