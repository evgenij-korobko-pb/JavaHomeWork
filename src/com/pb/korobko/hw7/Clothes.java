package com.pb.korobko.hw7;

public abstract class Clothes{

    public Size cSize;
    public String color;
    public double price;

    public Clothes(Size cSize, String color, double price) {
        this.cSize = cSize;
        this.color = color;
        this.price = price;
    }
}