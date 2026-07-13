package com.jedy.coredsa.playground;

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

public void addAccountHolder(String name){
    accountHolder = name;
}

public double deposit (double amount){
    return balance += amount;
}

public double withdraw (double amount){
    if(amount > balance){
        System.out.println("Insufficient funds");
        return balance;
    }
    return balance -= amount;
}

public double getBalance(){
    return balance;
}
    }