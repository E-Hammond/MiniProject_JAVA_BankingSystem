package org.classes;

import org.interfaces.IBranch;

import java.util.ArrayList;

public class Branch implements IBranch {
    String name;
    ArrayList<Customer> customers;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    @Override
    public Customer findCustomer(String name) {
        for (int i = 0; i<customers.size(); i++){
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public boolean newCustomer(String name, double transaction) {
        String customer = null;
        for (Customer client : customers){
            if (name.equals(findCustomer(customer))){
                System.out.println("Customer already exist");
                return false;
            }
        }
        customers.add(new Customer(name));
        return true;
    }

    @Override
    public boolean addCustomerTransaction(String name, double transaction) {
        return false;
    }
}
