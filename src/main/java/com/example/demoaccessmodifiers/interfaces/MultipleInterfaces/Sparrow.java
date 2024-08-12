package com.example.demoaccessmodifiers.interfaces.MultipleInterfaces;

public class Sparrow implements Flyable, Runnable{
    @Override
    public void fly() {
        System.out.println("sparrow is flying");
    }

    @Override
    public void run() {
        System.out.println("sparrow is running on the ground");
    }
}
