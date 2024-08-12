package com.example.demoaccessmodifiers.accessModifier;

public class User {
    public String name;
    private String phoneNumber;
    protected String role;
    String email;
    public int age;

    public User(){

    }

    public User(String nameValue, String roleValue){
        System.out.println("debug");
        name = nameValue;
        role = roleValue;
    }
}
