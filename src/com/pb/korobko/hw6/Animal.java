package com.pb.korobko.hw6;

public class Animal {

    //Конструктор
    public Animal(String food, String location){
        setFood(food);
        setLocation(location);
    }

    //Переменные
    private String food;
    private String location;


    //Установка
    public void setFood(String food){
        this.food = food;
    }

    public void setLocation(String location){
        this.location = location;
    }

    //Получение
    public String getFood(){
        return this.food;
    }

    public String getLocation(){
        return this.location;
    }


    //Методы
    protected void makeNoise(String zhivotn){
        System.out.println(zhivotn + " издаёт звук.");
    }

    protected void eat (String zhivotn){
        System.out.println(zhivotn + " Ест.");
    }

    public void sleep(String zhivotn){
        System.out.println(zhivotn + " Спит отдыхает.");
    }
}