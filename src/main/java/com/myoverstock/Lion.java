package com.myoverstock;

public class Lion extends Animal {

    void makeNoise() {
        System.out.println("lion roaring");
    }

    public String eat() {
        //calls superclasses version of eat
        super.eat();
        return "lion eating";
    }
}
