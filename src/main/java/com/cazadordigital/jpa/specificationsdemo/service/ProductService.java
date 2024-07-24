package com.cazadordigital.jpa.specificationsdemo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;

import com.cazadordigital.jpa.specificationsdemo.persistence.entity.Product;
import com.cazadordigital.jpa.specificationsdemo.persistence.specification.SearchProductSpecification;

public interface ProductService {

	List<Product> findAllByNameContainingIgnoreCaseAndPriceLessThanEqualAndPriceGreaterThanEqualAndCategoryNameContainingIgnoreCase(
			String name, BigDecimal minPrice, BigDecimal maxPrice, String categoryName);

	List<Product> findAllByPriceLessThanEqual(BigDecimal maxPrice);

	List<Product> findAllByNameContainingIgnoreCase(String name);

	List<Product> findAllByNameContainingIgnoreCaseAndCategoryNameContainingIgnoreCase(String name,
			String categoryName);

	List<Product> findAllByPriceLessThanEqualAndPriceGreaterThanEqual(BigDecimal maxPrice, BigDecimal minPrice);

	List<Product> findAllByNameContainingIgnoreCaseAndCategoryNameIgnoreCaseAndPriceLessThanEqual(String name,
			String categoryName, BigDecimal maxPrice);

	List<Product> findAllByNameContainingIgnoreCaseAndCategoryNameIgnoreCaseAndPriceGreaterThanEqual(String name,
			String categoryName, BigDecimal minPrice);

	List<Product> findAll();

	List<Product> findAll(SearchProductSpecification specification);

	List<Product> findAll(Example<Product> example);

	List<Product> findAll(Specification<Product> priceGreaterThanEqualSpecification);

}
