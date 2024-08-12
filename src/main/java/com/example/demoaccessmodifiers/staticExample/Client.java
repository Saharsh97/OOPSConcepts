package com.example.demoaccessmodifiers.staticExample;

public class Client {
    public static void main(String[] args) {
        Student.think("OOPS");
        Student st1 = new Student();
        st1.name = "Karthik";
        st1.age = 20;
//        st1.batch = "AugMorning";
//
        Student st2 = new Student();
        st2.name = "Ujwal";
        st2.age = 22;
        System.out.println("st2 batch: " + Student.batch + " " + st2.batch);


        Student st3 = new Student();
        st3.name = "Navdeep";
        st3.age = 24;
//        st3.batch = "NovMorning";
//
        System.out.println("st3 batch: " + Student.batch + st3.batch);
        System.out.println("st2 batch: " + Student.batch + st2.batch);
        System.out.println("st1 batch: " + Student.batch);
//
//        st1.learn();
//        st2.learn();
//        Student.learn();
//
//        System.out.println(st1.name);
//        System.out.println(Student.batch);
//
//        Student.batch = "SeptEvening";
//
//        Student.learn();
//        doSomething();
////        int y = Animal.number;
////        Animal animal = new Animal();
////        animal.number = 10;
////        System.out.println(animal.number);
////        System.out.println(animal.z);
////        animal.doSomething();
    }

    public static void doSomething(){

    }
}
