package org.classes;

import org.interfaces.IBank;

import java.util.ArrayList;

public class Bank implements IBank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }


    @Override
    public boolean addBranch(String name) {
        String branchName = null;
        for (Branch branch : branches){
            if (name.equals(findBranch(branchName))){
                System.out.println("Branch already exist");
                return false;
            }
        }
        branches.add(new Branch(name));
        System.out.println("Branch was added successfully");
        return true;
    }

    @Override
    public Branch findBranch(String name) {
        for (int i=0; i< branches.size();i++){
            Branch branch = branches.get(i);
            if (branch.getName().equals(name)){
                return  branch;
            }
        }
        return  null;
    }

    @Override
    public boolean addCustomer(String branchName, String customerName, double transaction) {
        for (Branch branch : branches){
            String name = null;
            if (findBranch(name).equals(branchName)){
                Customer transcation1 = null;
                for (Double transact : transcation1.transactions){
                    if (transcation1.transactions.equals(transaction)){
                        if (transcation1.getName().equals(customerName)){
                            System.out.println("Customer already exist!");
                            return false;
                        }

                    }
            }
        }

        }
    this.name += customerName;
        return true;
    }

    @Override
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Customer transcation1 = null;

        for (Branch branch : branches){
            String name = null;
            if (findBranch(name).equals(branchName)){
                if (transcation1.getName().equals(customerName)){
                    for (Double transact : transcation1.transactions){
                        if (transcation1.transactions.equals(transaction)){
                            System.out.println("Transaction has been recorded earlier");
                            return false;
                        }
                      }
                    }
                }
            }
        transcation1.transactions.add(transaction);
        return true;
    }

    @Override
    public boolean listCustomers(String name, boolean printTransaction) {
        return false;
    }
}
