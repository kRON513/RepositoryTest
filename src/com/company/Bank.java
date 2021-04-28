package com.company;

import com.company.Model.Transactions;
import com.company.Model.Account;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Bank extends Transactions implements Runnable {
    List<Account> accountList = new ArrayList<>();

    Random random = new Random();

    Bank() {
        for (int i = 0; i <= 30; i++) {
            accountList.add(new Account("ACCOUNT " + i, random.nextInt(10000), random.nextInt(10000000)));
        }
    }

    @Override
    public void run() {
        //Random random = new Random();
        Account from = null;
        Account to = null;
        while (true) {

            int acc1 = random.nextInt(30);
            int acc2 = random.nextInt(30);
            if (acc1 == acc2)
                continue;
            from = accountList.get(acc1);
            to = accountList.get(acc2);
            break;
        }
        doTransaction(from, to, random.nextInt(400));
    }
}
