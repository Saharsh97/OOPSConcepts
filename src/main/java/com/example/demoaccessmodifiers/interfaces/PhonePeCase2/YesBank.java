package com.example.demoaccessmodifiers.interfaces.PhonePeCase2;

public class YesBank implements Bank{
    @Override
    public double getBalance() {
        return 100.0;
    }

    @Override
    public void createAccount(String email, String password, String name, String phoneNumber, double initialBalance) {
        // .. some impl. of YesBank...
    }

    @Override
    public void doTransaction(String from, String to, double amount) {
        // .. some Transaction done by YesBank...
    }

    @Override
    public void createFD() {

    }
}
