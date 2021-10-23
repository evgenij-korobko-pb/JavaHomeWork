package com.pb.korobko.hw3;

import java.util.Arrays;
import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 10 элементов массива ");
        int [] Mass = new int[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Введите " + i +" элемент массива ");
            Mass[i] = scan.nextInt();
        }

        int sum = 0;
        int pol = 0;
        System.out.println("Получен массив ");
        System.out.println(Arrays.toString(Mass));
        for (int i = 0; i < Mass.length; i++)
        {
            sum += Mass[i];
            if (Mass[i]>=0) { pol++;}
        }
        System.out.println();
        System.out.println("Сумма элементов массива = " + sum);
        System.out.println("Сумма положительных элементов массива = " + pol);

        int counter = 1;
        while (counter > 0)
        {
            counter = 0;
            for (int i = 0; i < (Mass.length-1); i++)
            {
                if (Mass[i] > Mass[i+1])
                {
                    int a = Mass[i];
                    int b = Mass[i+1];
                    Mass[i] = b;
                    Mass[i+1] = a;
                    counter++;
                }
            }
        }

        System.out.println("Отсортированный массив ");
        System.out.println(Arrays.toString(Mass));
    }
}