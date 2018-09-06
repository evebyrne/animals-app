package com.myoverstock;

public class Cat extends Animal {
    void makeNoise() {
        System.out.println("cat noise");
    }

    public String eat() {
        return "cat eating " + this.food;
    }
}
