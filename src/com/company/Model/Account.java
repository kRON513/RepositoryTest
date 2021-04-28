package com.company.Model;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account extends BankAcc {

    public String accountName;
    public String name;
    public String surname;
    public String patronymic;
    public String bankAddress;
    public String taxpayerIdentificationNumber;


    // public int balance = 1000;
    // public String accountName;
    // final Lock lock1 = new ReentrantLock();

    public Account(String accountName, int balance, int numberOfBankAccount) {
        this.numberOfBankAccount = numberOfBankAccount;
        this.balance = balance;
        this.accountName = accountName;
    }

    public Account() {
        super();

    }
   /* public void deposit(int amount) {
        synchronized (lock1) {
            this.balance = getBalance() + amount;
        }
    }

    public  void withdrawal(int amount) throws Exception {
        synchronized (lock1) {
            int balance = getBalance() - amount;
            if (balance <= 0) {
                throw new Exception("Not enough money for withdrawal");
            }
            this.balance = getBalance() - amount;
            // System.out.println(amount + " remaining in account: " + this.balance + " " + Thread.currentThread().getName());
        }
    }*/

    public int getBalance() {
        return this.balance;
    }
}

