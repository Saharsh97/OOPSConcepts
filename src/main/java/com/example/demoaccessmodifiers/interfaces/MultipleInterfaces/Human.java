package com.example.demoaccessmodifiers.interfaces.MultipleInterfaces;

public class Human implements Runnable, Swimmable, Flyable{
    @Override
    public void run() {
        System.out.println("human is running");
    }

    @Override
    public void swim() {
        System.out.println("human is swimming");
    }

    @Override
    public void fly() {
        System.out.println("human is flying");
    }
}
