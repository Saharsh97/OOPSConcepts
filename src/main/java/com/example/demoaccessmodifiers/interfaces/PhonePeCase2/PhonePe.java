package com.example.demoaccessmodifiers.interfaces.PhonePeCase2;

public class PhonePe {

    // talking to someone, that has all the behaviours of a bank
    Bank bank = new YesBank();

    public double showBalance(){
        return bank.getBalance();
    }

    public void saveAccount(String email, String password, String name, String phoneNumber, double initialBalance){
        bank.createAccount(email, password, name, phoneNumber, initialBalance);
    }

    public void sendMoney(String from, String to, double amount){
        bank.doTransaction(from, to, amount);
    }

    public void createFD(){

    }

}
