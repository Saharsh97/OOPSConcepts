package com.example.demoaccessmodifiers.interfaces.Example1;

public class Human implements Animal{
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    @Override
    public void think() {
        System.out.println("thinking about class");
        System.out.println("thinking about interfaces");
        System.out.println("thinking about job");
        System.out.println("thinking about today");
        System.out.println("overthinking...");
    }
}
