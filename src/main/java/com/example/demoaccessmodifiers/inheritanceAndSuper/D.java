package com.example.demoaccessmodifiers.inheritanceAndSuper;

public class D extends C {

    String batch;
    String instructor;

    public D(String batch, String instructor){
        super(null, null);
        this.batch = batch;
        this.instructor = instructor;
    }

    public D(String name, String role,
             String email, String pwd,
             String psp, String ranking,
             String batch, String instructor){
        super(name, role, email, pwd, psp, ranking);
        this.batch = batch;
        this.instructor = instructor;
    }

}
