package com.pb.korobko.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes{

    public Pants(Size cSize, String color, double price) {
        super(cSize, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Джинси  для чоловіків: розмір " + cSize + "(" + cSize.getDescription() + "," + cSize.getEuroSize() + "), колір " + color + ", вартість " + price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Джинси для жінок: розмір " + cSize + "(" + cSize.getDescription() + "," + cSize.getEuroSize() + "), колір " + color + ", вартість " + price);
    }

}