package com.example.demoaccessmodifiers.interfaces.ClassExample;


public class Dog extends Cat {

    @Override
    public void eat(){
        System.out.println("dog is eating");
    }

    public void smile(){
        System.out.println("dog is smile");
    }
}
