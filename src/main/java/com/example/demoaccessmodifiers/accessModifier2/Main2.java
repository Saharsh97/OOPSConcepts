package com.example.demoaccessmodifiers.accessModifier2;

import com.example.demoaccessmodifiers.accessModifier.User;

public class Main2 {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.name);
//        System.out.println(user.role);

        Instructor instructor = new Instructor();
        System.out.println(instructor.name);
//        System.out.println(instructor.role);
    }
}
