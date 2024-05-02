package com.zaid.musicstoremanagement.services;

import com.zaid.musicstoremanagement.exceptions.CustomerNotFoundException;
import com.zaid.musicstoremanagement.models.Customer;

import java.util.*;
public interface UserService {
   Customer getCustomerById(Long Id) throws CustomerNotFoundException;
   List<Customer> getAllCustomers();
   Customer updateCustomer(Long id, Customer customer) throws CustomerNotFoundException;
   Customer createCustomer(Customer customer);
   void deleteCustomer(Long id) throws CustomerNotFoundException;
}
