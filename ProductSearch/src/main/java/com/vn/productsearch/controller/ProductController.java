package com.vn.productsearch.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vn.productsearch.model.Product;
import com.vn.productsearch.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	
	@RequestMapping("/products")
	public List<Product> getAllProduct(@RequestParam(value="name", defaultValue="World") String name) {
		
		ArrayList<Product> productList = new ArrayList<Product>();
		Iterator<Product> iterator = productRepository.findAll().iterator();
		
		while (iterator.hasNext())
			productList.add(iterator.next());
		
		return productList;
	}
	
}
