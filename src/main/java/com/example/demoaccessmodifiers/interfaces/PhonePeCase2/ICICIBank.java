package com.example.demoaccessmodifiers.interfaces.PhonePeCase2;

public class ICICIBank implements Bank{
    @Override
    public double getBalance() {
        return 100.0;
    }

    @Override
    public void createAccount(String email, String password, String name, String phoneNumber, double initialBalance) {
        // some impl. of ICICI bank for creating account
        // ...
        // ...
    }

    @Override
    public void doTransaction(String from, String to, double amount) {
        // some impl. of ICICI bank for doing transactions
        // ...
        // ...
    }

    public void createFD(){
        System.out.println("FD created");
    }
}
