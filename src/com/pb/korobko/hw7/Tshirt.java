package com.pb.korobko.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {


    public Tshirt(Size cSize, String color, double price) {
        super(cSize, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка для чоловікі: розмір " + cSize + "(" + cSize.getDescription() + "," + cSize.getEuroSize() + "), колір " + color + ", вартість " + price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка для жінок: розмір " + cSize + "(" + cSize.getDescription() + "," + cSize.getEuroSize() + "), колір " + color + ", вартість " + price);
    }
}