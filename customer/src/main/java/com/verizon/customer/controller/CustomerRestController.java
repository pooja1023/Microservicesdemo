package com.verizon.customer.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.customer.model.Customer;

@RestController
public class CustomerRestController {
	private static Map<Integer,Customer> customerdb = new HashMap<Integer,Customer>();
	 
    static {
        
        
        Customer cs1 = new Customer(1, "Ramesh");
        Customer cs1 = new Customer(2, "Suresh");
 
        customerdb.put(cs1.getId(),cs1);
    }
 
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public  Customer getCustomers(@PathVariable int id) {
        System.out.println("Getting Customer details for " + id);
 
        Customer c = customerdb.get(id);
        
        return c;
    }
}
	
