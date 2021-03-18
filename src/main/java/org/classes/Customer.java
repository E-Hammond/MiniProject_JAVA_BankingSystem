package org.classes;

import org.interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    String name;
    ArrayList<Double> transactions;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public void addTransaction(double transaction) {
        if (this.transactions.indexOf(transaction)>=0){
            System.out.println("Transaction has already been recorded");
        } else
            this.transactions.add(transaction);
        System.out.println("Transaction added successfully!");
    }
}
