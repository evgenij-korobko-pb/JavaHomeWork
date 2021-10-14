package hw2;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        int resultat;

        System.out.println("Пожалуйста выберете  первое число и нажмите ENTER");
        operand1 = scan.nextInt();
        System.out.println("Пожалуйста выберете второе число и нажмите ENTER");
        operand2 = scan.nextInt();
        System.out.println("Пожалуйста выберете арифметический знак (+ - * / ) и нажмите ENTER");
        sign = scan.next();

        switch (sign) {
            case "+":
                resultat = operand1 + operand2;
                System.out.println("Результат: " + operand1 + " " + sign + " " + operand2 + " = " + resultat);
                break;
            case "-":
                resultat = operand1 - operand2;
                System.out.println("Результат: " + operand1 + " " + sign + " " + operand2 + " = " + resultat);
                break;
            case "*":
                resultat = operand1 * operand2;
                System.out.println("Результат: " + operand1 + " " + sign + " " + operand2 + " = " + resultat);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Деление на 0 невозможно!");
                } else {
                    resultat = operand1 / operand2;
                    System.out.println("Результат: " + operand1 + " " + sign + " " + operand2 + " = " + resultat);                        }
                break;
            default:
                System.out.println("Введены неправильные данные, попробуйте всё сначала");
        }
        // System.out.println(operand1 + " " + "sign" + " " + operand2 + " = " + resultat);
    }
}