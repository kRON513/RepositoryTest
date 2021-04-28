package com.company.Model;


public class Transactions extends Account {
    public int countTransaction;


    public Transactions() {
        super();


    }

    public void doTransaction(Account from, Account to, int nextInt) {
        try {
            System.out.println("TRANSACTION CREATED, " + "FINAL BALANCE - " + from.accountName + "[BALANCE " + from.getBalance() + "]," +
                    to.accountName + "[BALANCE " + to.getBalance() + "] " + Thread.currentThread().getName());

            from.withdrawal(nextInt);
            to.deposit(nextInt);
            countTransaction++;
            System.out.println("[TRANSACTION:" + countTransaction + "],[TRANSFER FROM BANK ACCOUNT ID{" + from.numberOfBankAccount + "}" + " TO BANK ACCOUNT ID{" + to.numberOfBankAccount + "}" +
                    "],[TRANSFER FOR THE AMOUNT:" + nextInt + "],FROM:{" + from.accountName + " [BALANCE " + from.getBalance() + "] TO " + to.accountName
                    + " [BALANCE " + to.getBalance() + "] - " + Thread.currentThread().getName());

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}