package com.example.demoaccessmodifiers.interfaces.PhonePeCase2;

// made by RBI
public interface Bank {
    double getBalance();
    void createAccount(String email, String password, String name, String phoneNumber, double initialBalance);
    void doTransaction(String from, String to, double amount);
    void createFD();
}
