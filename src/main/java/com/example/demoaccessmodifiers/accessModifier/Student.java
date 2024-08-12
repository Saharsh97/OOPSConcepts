package com.example.demoaccessmodifiers.accessModifier;

public class Student extends User{

    public void doSomething(){
        User user = new User();
        user.name = "abc";
        user.email = "123";
        user.role = "admin";
    }
}
