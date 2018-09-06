package com.myoverstock;

import java.io.Serializable;

public class Dog extends Animal implements Pet, Serializable {
    void makeNoise() {
        System.out.println("dog barking");
    }

    public String eat() {
        return "dog eating " + this.food;
    }

    //if you create your ownconstructor you have to supply the default
    public Dog() {
        //call super (Animal) constructor -> dont really need, will be put in automagically
        food = "peanut butter";
        hunger = 5;
    }

    public Dog(String _food, int _hunger) {
        food = _food;
        hunger = _hunger;
    }

    public void beFriendly() {
        System.out.println("dog being friendly");
    }

    public void play() {
        System.out.println("dog playing");
    }
}

