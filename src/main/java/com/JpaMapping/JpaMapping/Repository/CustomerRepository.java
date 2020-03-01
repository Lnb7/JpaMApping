package com.JpaMapping.JpaMapping.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.JpaMapping.JpaMapping.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	//@Query("SELECT new com.JpaMapping.JpaMapping.Dto.OrderResponse(c.name, p.productName) FROM Customer c join c.products p")
	//public List<OrderResponse> getJoinInformation();
}
