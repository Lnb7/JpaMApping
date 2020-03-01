package com.JpaMapping.JpaMapping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JpaMapping.JpaMapping.Dto.OrderRequest;

import com.JpaMapping.JpaMapping.Entity.Customer;
import com.JpaMapping.JpaMapping.Repository.CustomerRepository;
import com.JpaMapping.JpaMapping.Repository.ProductRepository;

@RestController
public class OrderController {

	 @Autowired
	 private CustomerRepository customerRepository;
	 
	 @Autowired
	 private ProductRepository productRepository;

	    @PostMapping("/placeOrder")
	    public Customer placeOrder(@RequestBody OrderRequest request){
	       return customerRepository.save(request.getCustomer());
	    }

	    @GetMapping("/findAllOrders")
	    public List<Customer> findAllOrders(){
	        return customerRepository.findAll();
	    }
	    
	 
	    
}
