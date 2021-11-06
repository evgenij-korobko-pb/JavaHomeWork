package com.pb.korobko.hw6;

public class Veterinarian {
    void treatAnimal(Animal animal){
        System.out.println(" ест еду " + '"' + animal.getFood()+ '"' +
                " в месте " + '"' + animal.getLocation()+ '"' +  ".");
    }
}