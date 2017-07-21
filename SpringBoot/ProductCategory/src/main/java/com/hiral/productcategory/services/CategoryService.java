package com.hiral.productcategory.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hiral.productcategory.models.Category;
import com.hiral.productcategory.repositories.CategoryRepository;

@Service
public class CategoryService {
	private CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public void addCategory(Category category){
		categoryRepository.save(category);
	}

	public List<Category> allCategories() {
		return (List<Category>) categoryRepository.findAll();
	}

	public Category findOne(Long id) {
		return categoryRepository.findOne(id);
	}

	public void update(Category category) {
		categoryRepository.save(category);
	}
}
