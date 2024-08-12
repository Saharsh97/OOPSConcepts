package com.example.demoaccessmodifiers.AbstractClass;

public class Lion extends Animal{


    public void sleep(){
        System.out.println("sleeping upside down");
    }

    @Override
    public void walk() {
        System.out.println("lion is walking");
    }

    @Override
    public void makeSound() {
        System.out.println("roar");
    }

    @Override
    public void move() {
        System.out.println("moving aggressively");
    }

    public void hunt(){
        System.out.println("lion is hunting");
    }
}
