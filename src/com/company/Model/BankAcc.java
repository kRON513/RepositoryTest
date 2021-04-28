package com.company.Model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAcc {

    public int balance;
    public int numberOfBankAccount;
    final Lock lock1 = new ReentrantLock();

    public BankAcc(int balance, int numberOfBankAccount) {
        this.balance = balance;
        this.numberOfBankAccount = numberOfBankAccount;
    }

    public BankAcc() {

    }

    public BankAcc(int balance) {
    }

    public void withdrawal(int amount) throws Exception {
        synchronized (lock1) {
            int balance = getBalance() - amount;
            if (balance <= 0) {
                throw new Exception("TRANSACTION FAILED!: Not enough money for withdrawal"+" [BANK ACCOUNT ID "+numberOfBankAccount+"]"+"BALANCE["+balance+"]");
            }
            this.balance = getBalance() - amount;
        }
    }

    public void deposit(int amount) {
        synchronized (lock1) {
            this.balance = getBalance() + amount;
        }
    }


    private int getBalance() {
        synchronized (lock1) {
            return this.balance;
        }
    }

}