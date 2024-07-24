package com.cazadordigital.jpa.specificationsdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.cazadordigital.jpa.specificationsdemo.persistence.entity.Category;
import com.cazadordigital.jpa.specificationsdemo.persistence.repository.CategoryRepository;
import com.cazadordigital.jpa.specificationsdemo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository repository;

	@Override
	public List<Category> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Category> findAll(Specification<Category> categoryWithoutProductsSpecification) {
		return repository.findAll(categoryWithoutProductsSpecification);
	}

}
