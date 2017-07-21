package com.hiral.productcategory.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hiral.productcategory.models.Product;
import com.hiral.productcategory.repositories.ProductRepository;

@Service
public class ProductService {
	private ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public void addProduct(Product product){
		productRepository.save(product);
	}

	public Product findOne(Long id) {
		return productRepository.findOne(id);
	}

	public void update(Product product) {
		productRepository.save(product);
	}

	public List<Product> allProducts() {
		return (List<Product>) productRepository.findAll();
	}
}
