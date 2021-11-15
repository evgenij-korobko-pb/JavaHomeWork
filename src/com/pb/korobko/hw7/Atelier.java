package com.pb.korobko.hw7;

public class Atelier {
    public static void main(String[] args) {

        Tshirt tshirt1 = new Tshirt(Size.L, "червоний", 150);
        Tshirt tshirt2 = new Tshirt(Size.XXS, "рожвий", 120);
        Pants pants1 = new Pants(Size.M, "сірий", 250);
        Pants pants2 = new Pants(Size.S, "чорний", 250);
        Pants pants3 = new Pants(Size.XXS, "жовтий", 200);
        Skirt skirt1 = new Skirt(Size.XS, "зелений", 150);
        Skirt skirt2 = new Skirt(Size.XXS, "салатовий", 90);
        Tie tie1 = new Tie(Size.XS, "чорний", 120);
        Tie tie2 = new Tie(Size.XXS, "фіолетовий", 80);

        Clothes[] clothes = new Clothes[]{tshirt1, tshirt2, pants1, pants2, skirt1, skirt2, tie1, tie2, pants3};

        System.out.println("У  нашому магазині великий вибір одягу для дорослих та дітей.\n\nДля чоловіків");
        dressMan(clothes);

        System.out.println("\nДля жінок");
        dressWomen(clothes);


    }

    public static void dressMan(Clothes[] clothes) {

        for (Clothes clot : clothes) {
            if (clot instanceof ManClothes) {
                ((ManClothes) clot).dressMan();
            }
        }

    }

    public static void dressWomen(Clothes[] clothes) {

        for (Clothes clot : clothes) {
            if (clot instanceof WomenClothes) {
                ((WomenClothes) clot).dressWomen();
            }
        }
    }


}
