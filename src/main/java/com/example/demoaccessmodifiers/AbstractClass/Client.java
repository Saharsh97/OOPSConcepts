package com.example.demoaccessmodifiers.AbstractClass;

public class Client {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.name = "Simba";
        lion.age = 20;
        lion.move();
        lion.makeSound();
        lion.sleep();
        lion.hunt();
        lion.walk();
        //

        Cat cat = new Cat();
        cat.name = "Tom";
        cat.age = 10;
        cat.move();
        cat.makeSound();
        cat.sleep();
        cat.walk();

        System.out.println("Lion2 ...");
        Lion lion2 = new Lion();
        lion2.age = 30;
        lion2.name = "King";
        lion2.move();
        lion2.makeSound();
        lion2.sleep();
        lion2.walk();
        lion2.hunt();

//        Animal animal = new Animal();
    }
}
