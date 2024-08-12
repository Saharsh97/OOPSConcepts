package com.example.demoaccessmodifiers.PassByValueExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Student st = new Student("Saharsh", 27, "AugMorning");
        changeAge(st.age);
        changeName(st);
        changeBatch(st);
        doSomething(st);
        System.out.println("DEBUG");
    }

    public static void changeAge(int y) {
        y = 100;
    }

    public static void changeName(Student x) {
        x.name = "Rohit";
    }
    public static void changeBatch(Student x) {
        x.batch = "SeptMorning";
    }

    public static void doSomething(Student x) {
        x = null;
    }
}
