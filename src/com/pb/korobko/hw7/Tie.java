package com.pb.korobko.hw7;

public class Tie extends Clothes implements ManClothes{

    public Tie(Size cSize, String color, double price) {
        super(cSize, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук для чоловіків: розмір " + cSize + "(" + cSize.getDescription() + "," + cSize.getEuroSize() + "), колір " + color + ", вартість " + price);
    }

}