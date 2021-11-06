package com.pb.korobko.hw6;

import java.util.Objects;

public class Horse extends Animal{

    //Конструктор
    public Horse (String food, String location, String otlichie){
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
        Horse horse = (Horse) o;
        return Objects.equals(otlichie, horse.otlichie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(otlichie);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "otlichie='" + otlichie + '\'' +
                '}';
    }

}