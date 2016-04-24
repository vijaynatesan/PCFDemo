package com.vn.productsearch.repository;

import org.springframework.data.repository.CrudRepository;

import com.vn.productsearch.model.Product;


public interface ProductRepository extends CrudRepository<Product, Long> {

}
	
