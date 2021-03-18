package org.interfaces;

import org.classes.Customer;

import java.util.ArrayList;

public interface IBranch {

     Customer findCustomer(String name);
     boolean newCustomer(String name, double transaction);
     boolean addCustomerTransaction(String name, double transaction);
}
