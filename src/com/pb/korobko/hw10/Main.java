package com.pb.korobko.hw10;

public class Main {
    public static void main(String[] args) {

        NumBox<Integer> i = new NumBox<>(4);

        try {
            i.add(1);
            i.add(5);
            i.add(4);
            i.add(3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Розмір масиву не дозволяє додати наступний елемент!");
        }

        System.out.println("Елемент масиву номер 1 дорівнює: " + i.get(0));
        System.out.println("Сума масиву дорівнює: " + i.sum());
        System.out.println("Довжина поточного масиву дорівнює: " + i.length());
        System.out.println("Середнє значення масиву дорівнює: " + i.average());
        System.out.println("Максимальне значення масиву дорівнює: " + i.max());
        System.out.println();

        NumBox<Float> d = new NumBox<>(4);

        try {
            d.add(2.5f);
            d.add(5.9f);
            d.add(4.3f);
            d.add(1.7f);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Розмір масиву не дозволяє додати наступний елемент!");
        }

        System.out.println("Елемент масиву номер 1 дорівнює: " + d.get(0));
        System.out.println("Сума масиву дорівнює: " + d.sum());
        System.out.println("Довжина поточного масиву дорівнює: " + d.length());
        System.out.println("Середнє значення масиву дорівнює: " + d.average());
        System.out.println("Максимальне значення масиву дорівнює: " + d.max());
    }
}