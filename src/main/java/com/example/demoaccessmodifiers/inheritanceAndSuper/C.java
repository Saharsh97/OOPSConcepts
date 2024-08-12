package com.example.demoaccessmodifiers.inheritanceAndSuper;

public class C extends B {

    private String psp;
    private String ranking;

//    public C(){
//        System.out.println("C constructor");
//    }

    public C(String psp, String ranking) {
        super(null, null);
        this.psp = psp;
        this.ranking = ranking;
    }

    public C(String email, String pwd, String psp, String ranking) {
        super(email, pwd);
        this.psp = psp;
        this.ranking = ranking;
    }

    public C(String name, String role,
             String email, String pwd,
             String psp, String ranking) {
        super(name, role, email, pwd);
        this.psp = psp;
        this.ranking = ranking;
    }
}
