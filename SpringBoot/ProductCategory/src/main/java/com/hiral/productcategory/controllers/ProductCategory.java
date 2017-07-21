package com.hiral.productcategory.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hiral.productcategory.models.Category;
import com.hiral.productcategory.models.Product;
import com.hiral.productcategory.services.CategoryService;
import com.hiral.productcategory.services.ProductService;

@Controller
@RequestMapping("/")
public class ProductCategory {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	
	public ProductCategory(ProductService productService, CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}

	@RequestMapping("")
	public String index(@ModelAttribute("product") Product product, Model model){
		model.addAttribute("products", productService.allProducts());
		model.addAttribute("categories", categoryService.allCategories());
		return "index";
	}
	
	@PostMapping("/product/new")
	public String addProduct(@Valid @ModelAttribute("product") Product product, BindingResult result){
		if(result.hasErrors()){
			return "index";
		}else{
			productService.addProduct(product);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/category/new")
	public String addCategory(@ModelAttribute("category") Category category){
		return "category";
	}
	
	@PostMapping("/category/new")
	public String addCategory(@Valid @ModelAttribute("category") Category category, BindingResult result){
		if(result.hasErrors()){
			return "category";
		}else{
			categoryService.addCategory(category);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/product/{id}")
	public String addCategoryToProduct(@ModelAttribute("category") Category category, Model model, @PathVariable("id") Long id){
		model.addAttribute("categories", categoryService.allCategories());
		model.addAttribute("product", productService.findOne(id));
		return "product";
	}
	
	@PostMapping("/addCategory/{id}")
	public String addCategory(@ModelAttribute("category") Category category, BindingResult result, @PathVariable("id") Long product_id){
		Product product = productService.findOne(product_id);
		Category cat = categoryService.findOne(Long.parseLong((String) result.getFieldValue("name")));
		
		List<Category> list = product.getCategories();
		list.add(cat);
		productService.update(product);
		return "redirect:/product/"+product_id;
	}
	
	@RequestMapping("/category/{id}")
	public String addProductToCategory(@ModelAttribute("product") Product product, Model model, @PathVariable("id") Long id){
		model.addAttribute("products", productService.allProducts());
		model.addAttribute("category", categoryService.findOne(id));
		return "categories";
	}
	
	@PostMapping("/addProduct/{id}")
	public String addProduct(@ModelAttribute("product") Product product, BindingResult result, @PathVariable("id") Long category_id){
		Category category = categoryService.findOne(category_id);
		Product prod = productService.findOne(Long.parseLong((String) result.getFieldValue("name")));
		List<Product> list = category.getProducts();
		list.add(prod);
		categoryService.update(category);
		return "redirect:/category/"+category_id;	
	}
}
