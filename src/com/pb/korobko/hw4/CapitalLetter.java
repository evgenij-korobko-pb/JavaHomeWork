package com.pb.korobko.hw4;

import java.util.Scanner;

public class CapitalLetter {

    // метод заменяет первый символ строки на верхний регистр и возвращает результат
    static String toFirstCapitalLetter(String toUp) {
        char[] chRes = toUp.toCharArray();
        chRes[0] =  Character.toUpperCase(chRes[0]);
        return String.valueOf(chRes);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      // ввод данных пользователя
        String UserStr;                             // строка для обработки

        System.out.println("Программа переводит в верхний регистр первую букву каждого слова во введенной фразе.");
        System.out.print("Введите фразу -> ");
        UserStr = scan.nextLine();

        String[] UserStrPart = UserStr.split(" ");
        System.out.print("              ->");

        for (int i=0; i < UserStrPart.length ; i++){
            System.out.print(" "+toFirstCapitalLetter(UserStrPart[i]));
        }

    }
}