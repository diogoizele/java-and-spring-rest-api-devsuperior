package com.diogoizele.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diogoizele.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
