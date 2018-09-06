package com.myoverstock;

import java.io.*;

public class Animal {

    //All animals will have these instance variables with different values
    String pic;
    private String name;
    String food;
    Integer hunger;
    String boundaries;
    String location;

    public String getName() {
        return name;
    }

    public Animal() {
        name = "default name";
    }

    public Animal(String _name) {
        name = _name;
    }

    //two methods below will be overrided to be specific to each animal
    void makeNoise() {
        System.out.println("animal noise");
    }

    public String eat() {
        return "animal eating";
    }

//    public String eat(){
//        System.out.println("animal eating");
//    }

    void sleep() {
        System.out.println("animal sleeping");
    }

    void roam() {
        System.out.println("animal roaming");
    }

}