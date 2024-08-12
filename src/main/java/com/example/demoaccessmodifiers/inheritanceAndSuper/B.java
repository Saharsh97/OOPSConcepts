package com.example.demoaccessmodifiers.inheritanceAndSuper;

public class B extends A {

    private String email;
    private String pwd;

//    public B() {
//        System.out.println("B constructor");
//    }

    public B(String email, String pwd) {
        super(null, null);
        this.email = email;
        this.pwd = pwd;
    }

    public B(String name, String role,
             String email, String pwd) {
        super(name, role);
        this.email = email;
        this.pwd = pwd;
    }

}
