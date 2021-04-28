package com.company;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Test {

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(100);
        Bank BankObject = new Bank();
        for (int i = 0; i <= 5; i++) {
            service.submit(BankObject);
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);

    }
}
