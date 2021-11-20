package com.pb.korobko.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Для реєстрації на сайті необхідно створити логін та пароль");
        System.out.println("Придумайте логін від 5 до 20 символів (можна використовувати латиницю та цифри)");
        System.out.println("Введіть логін:");
        String login1 = scan.nextLine();
        System.out.println("Придумайте пароль від 5 до 20 символів (можна використовувати латиницю, цифри та знак підкреслення)");
        System.out.println("Введіть пароль:");
        String password1 = scan.nextLine();
        System.out.println("Повторіть пароль:");
        String confirm1 = scan.nextLine();
        Auth auth = new Auth(login1, password1);

        try {
            auth.signUp(login1, password1, confirm1);
        } catch (WrongLoginException e1) {
            System.out.println("Повторіть спробу реєстрації!");
            return;
        } catch (WrongPasswordException e2) {
            System.out.println("Повторіть спробу реєстрації!");
            return;
        }

        System.out.println();
        System.out.println("Авторизація на сайті");
        System.out.println("Введіть логін:");
        String login2 = scan.nextLine();
        System.out.println("Введіть пароль:");
        String password2 = scan.nextLine();

        try {
            auth.signUp(login2, password2);
        } catch (WrongLoginException e1) {
            System.out.println("Повторіть спробу авторизації!");
        }
    }
}
