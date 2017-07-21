package com.hiral.productcategory.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.productcategory.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
