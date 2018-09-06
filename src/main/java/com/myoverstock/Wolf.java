package com.myoverstock;

public class Wolf extends Animal {
    void makeNoise() {
        System.out.println("wolf noise");
    }

    public String eat() {
        return "wolf eating " + this.food;
    }
}
