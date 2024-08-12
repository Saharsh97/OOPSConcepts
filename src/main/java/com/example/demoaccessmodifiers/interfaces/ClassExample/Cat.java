package com.example.demoaccessmodifiers.interfaces.ClassExample;

public class Cat implements Animal{
//    void annoy();
//    void jump();

    public void eat(){
        System.out.println("cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("cat is sleeping");
    }

    @Override
    public void move() {

    }

    public void annoy(){

    }
}
