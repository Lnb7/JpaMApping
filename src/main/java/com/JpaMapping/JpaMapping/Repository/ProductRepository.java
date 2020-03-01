package com.JpaMapping.JpaMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JpaMapping.JpaMapping.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
