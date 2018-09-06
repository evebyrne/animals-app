package com.myoverstock;

public class Vet {

    public void giveShot(Animal a){
        System.out.println("vet giving shot to " +a);
        a.makeNoise();
    }
}
