package com.example.demoaccessmodifiers.AbstractClass;

public abstract class Animal {
    public String name = "default animal";
    public int age = 5;

    // all animals sleep this way.
    public void sleep(){
        System.out.println("sleeping zzz ...");
    }

    public abstract void walk();
    // now this is very vague.
    // some meow, some bark, some roar, some speak;
    public abstract void makeSound();


    // some fly, some run, some walk, etc..
    public abstract void move();
}
