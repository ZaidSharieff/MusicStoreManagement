package com.zaid.musicstoremanagement.controllers;

import com.zaid.musicstoremanagement.exceptions.CustomerNotFoundException;
import com.zaid.musicstoremanagement.models.Customer;
import com.zaid.musicstoremanagement.services.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    UserController(@Qualifier("selfUserService") UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getcustomerbyId(@PathVariable("id") Long id) throws CustomerNotFoundException {
        Customer customer = userService.getcustomerbyId(id);
        ResponseEntity<Customer> responseEntity;
        responseEntity = new ResponseEntity<>(customer, HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping()
    public List<Customer> getAllCustomer() {
        return userService.getAllCustomer();
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable("id") Long id, @RequestBody Customer customer) throws CustomerNotFoundException {
        return userService.updateCustomer(id, customer);
    }


    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) { // can use DTO as well.
        return userService.createCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Long id) throws CustomerNotFoundException {
        userService.deleteCustomer(id);
    }


}
