package com.pb.korobko.hw7;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt(Size cSize, String color, double price) {
        super(cSize, color, price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка для жінок: розмір " + cSize + "(" + cSize.getDescription() + "," + cSize.getEuroSize() + "), колір " + color + ", вартість " + price);
    }

}