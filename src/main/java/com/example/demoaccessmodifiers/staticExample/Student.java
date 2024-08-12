package com.example.demoaccessmodifiers.staticExample;

public class Student {
    public String name;
    public int age;
    public static final String batch = "AugMorning";

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
    }

    public void solve(){
        System.out.println("solving question");
    }

    public static void learn(){
        System.out.println("learning...");
    }

    public static void think(String topic){
        int questions = 10;
        System.out.println("batch : " + batch);
        learn();
        System.out.println("topic : " + topic);
        System.out.println("noOfQuestions : " + questions);
    }

}
