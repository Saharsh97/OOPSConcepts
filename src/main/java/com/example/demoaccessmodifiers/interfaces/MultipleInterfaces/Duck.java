package com.example.demoaccessmodifiers.interfaces.MultipleInterfaces;

public class Duck implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("duck is swimming");
    }
}
