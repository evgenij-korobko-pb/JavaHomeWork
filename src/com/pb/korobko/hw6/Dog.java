package com.pb.korobko.hw6;

import java.util.Objects;

public class Dog extends Animal{

    //Конструктор
    public Dog (String food, String location, String otlichie){
        super(food, location);
        setOtlichie(otlichie);
    }

    //Переменные
    private String otlichie;

    //Установка
    public void setOtlichie(String otlichie){
        this.otlichie = otlichie;
    }

    //Получение
    public String getOtlichie(){
        return this.otlichie;
    }


    //Переопределение
    @Override
    protected void makeNoise(String zhivotn) {
        System.out.println(zhivotn + " очень сильно издаёт звуки.");
    }

    @Override
    protected void eat(String zhivotn) {
        System.out.println(zhivotn + " много Ест.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(otlichie, dog.otlichie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(otlichie);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "otlichie='" + otlichie + '\'' +
                '}';
    }
}