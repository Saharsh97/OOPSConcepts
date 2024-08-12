package com.example.demoaccessmodifiers.AbstractClass;

public class Cat extends Animal{


    @Override
    public void walk() {
        System.out.println("cat is walking");
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public void move() {
        System.out.println("cat is moving and breaking all the things as it goes");
    }
}
