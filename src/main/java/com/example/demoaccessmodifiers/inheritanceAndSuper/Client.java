package com.example.demoaccessmodifiers.inheritanceAndSuper;

public class Client {
    public static void main(String[] args) {
        D d = new D("AugMorning", "Saharsh");
        System.out.println(d);

        D d1 = new D("D1", "Student",
                "d@scaler.com", "pwd123",
                "80.5", "2",
                "AugMorning", "Saharsh");
        System.out.println(d1);
    }
}
