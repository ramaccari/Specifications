package com.cazadordigital.jpa.specificationsdemo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cazadordigital.jpa.specificationsdemo.persistence.entity.Category;
import com.cazadordigital.jpa.specificationsdemo.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/v0")
	public List<Category> findAllv0() {
		return categoryService.findAll();
	}

	@GetMapping("/v1")
	public List<Category> findAllv1() {

		Specification<Category> categoryWithoutProductsSpecification = (root, query, criteriaBuilder) -> {
			return criteriaBuilder.isEmpty(root.get("products"));
		};

		return categoryService.findAll(categoryWithoutProductsSpecification);
	}

}
