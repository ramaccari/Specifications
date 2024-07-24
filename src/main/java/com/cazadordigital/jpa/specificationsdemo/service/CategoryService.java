package com.cazadordigital.jpa.specificationsdemo.service;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.cazadordigital.jpa.specificationsdemo.persistence.entity.Category;

public interface CategoryService {

	List<Category> findAll();

	List<Category> findAll(Specification<Category> categoryWithoutProductsSpecification);

}
