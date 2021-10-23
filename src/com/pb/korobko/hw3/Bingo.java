package com.pb.korobko.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = (int) ( Math.random() * 101 );

        System.out.println("Угадайте задуманное число от 0 до 100 ");
        System.out.println("Для завершеня игры введите 1000 ");
        int operand = -1;
        int counter = 0;
        while (operand != a) {
            counter++;
            operand = scan.nextInt();
            if (operand == 1000) {
                System.out.print("Игра окончена");
                break;
            } else
            if (operand == a) {
                System.out.print("Поздравляем, Вы угадали задуманное число с "+ counter + " попытки");
            }
            else
            if (operand > a) {
                System.out.print("задуманное число меньше Вашего ");
            }
            else
            {
                System.out.print("задуманное число больше Вашего ");
            }
        }

    }

}