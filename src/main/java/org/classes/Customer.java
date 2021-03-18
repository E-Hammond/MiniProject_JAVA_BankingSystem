package org.classes;

import org.interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    String name;
    ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

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
