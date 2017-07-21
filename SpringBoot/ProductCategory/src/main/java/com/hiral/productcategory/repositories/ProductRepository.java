package com.hiral.productcategory.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.productcategory.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	
}
