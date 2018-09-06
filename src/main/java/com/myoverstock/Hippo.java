package com.myoverstock;

public class Hippo extends Animal {
    void makeNoise() {
        System.out.println("hippo noise");
    }

    public String eat() {
        return "hippo eating";
    }

    public Hippo() {
        super("hippo");
    }

    public Hippo(String _name) {
        super(_name);
    }
}
