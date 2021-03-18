package org.interfaces;

import org.classes.Branch;

public interface IBank {
    boolean addBranch(String name);
    Branch findBranch(String name);
    boolean addCustomer(String branchName, String customerName, double transaction);
    boolean addCustomerTransaction(String branchName,String customerName, double transaction);
    boolean listCustomers (String name, boolean printTransaction);
}
