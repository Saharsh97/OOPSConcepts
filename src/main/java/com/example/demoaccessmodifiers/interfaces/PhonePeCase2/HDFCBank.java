package com.example.demoaccessmodifiers.interfaces.PhonePeCase2;

public class HDFCBank implements Bank{
    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void createAccount(String email, String password, String name, String phoneNumber, double initialBalance) {

    }

    @Override
    public void doTransaction(String from, String to, double amount) {

    }

    @Override
    public void createFD() {

    }
}
