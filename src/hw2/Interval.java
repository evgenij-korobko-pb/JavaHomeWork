package hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;

        System.out.print("Введите целое число: ");
        num1 = scan.nextInt();

        if (num1 >= 0 && num1 <= 14) {
            System.out.print("Ваше число попадает в интервал [0-14]");
        } else if (num1 >= 15 && num1 <= 35) {
            System.out.print("Ваше число попадает в интервал [15-35]");
        } else if (num1 >= 36 && num1 <= 50) {
            System.out.print("Ваше число попадает в интервал [36-50]");
        } else if (num1 >= 51 && num1 <= 100) {
            System.out.print("Ваше число попадает в интервал [51-100]");
        } else {
            System.out.print("Ваше число не попадает ни в один из указаных интервалов");
        }
    }
}