package com.example.demoaccessmodifiers.interfaces.Example1;

public class Cat implements Animal{

    public String name;


    @Override
    public void eat() {
        System.out.println("cat is eating...");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    @Override
    public void think() {

    }

    public void stare(){
        System.out.println("cat is staring....");
    }
}
