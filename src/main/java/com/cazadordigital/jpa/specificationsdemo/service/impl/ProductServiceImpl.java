package com.cazadordigital.jpa.specificationsdemo.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.cazadordigital.jpa.specificationsdemo.persistence.entity.Product;
import com.cazadordigital.jpa.specificationsdemo.persistence.repository.ProductRepository;
import com.cazadordigital.jpa.specificationsdemo.persistence.specification.SearchProductSpecification;
import com.cazadordigital.jpa.specificationsdemo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repository;

	@Override
	public List<Product> findAllByNameContainingIgnoreCaseAndPriceLessThanEqualAndPriceGreaterThanEqualAndCategoryNameContainingIgnoreCase(
			String name, BigDecimal minPrice, BigDecimal maxPrice, String categoryName) {
		return repository
				.findAllByNameContainingIgnoreCaseAndPriceLessThanEqualAndPriceGreaterThanEqualAndCategoryNameContainingIgnoreCase(
						name, minPrice, maxPrice, categoryName);
	}

	@Override
	public List<Product> findAllByPriceLessThanEqual(BigDecimal maxPrice) {
		return repository.findAllByPriceLessThanEqual(maxPrice);
	}

	@Override
	public List<Product> findAllByNameContainingIgnoreCase(String name) {
		return repository.findAllByNameContainingIgnoreCase(name);
	}

	@Override
	public List<Product> findAllByNameContainingIgnoreCaseAndCategoryNameContainingIgnoreCase(String name,
			String categoryName) {
		return repository.findAllByNameContainingIgnoreCaseAndCategoryNameContainingIgnoreCase(name, categoryName);
	}

	@Override
	public List<Product> findAllByPriceLessThanEqualAndPriceGreaterThanEqual(BigDecimal maxPrice, BigDecimal minPrice) {
		return repository.findAllByPriceLessThanEqualAndPriceGreaterThanEqual(maxPrice, minPrice);
	}

	@Override
	public List<Product> findAllByNameContainingIgnoreCaseAndCategoryNameIgnoreCaseAndPriceLessThanEqual(String name,
			String categoryName, BigDecimal maxPrice) {
		return repository.findAllByNameContainingIgnoreCaseAndCategoryNameIgnoreCaseAndPriceLessThanEqual(name,
				categoryName, maxPrice);
	}

	@Override
	public List<Product> findAllByNameContainingIgnoreCaseAndCategoryNameIgnoreCaseAndPriceGreaterThanEqual(String name,
			String categoryName, BigDecimal minPrice) {
		return repository.findAllByNameContainingIgnoreCaseAndCategoryNameIgnoreCaseAndPriceGreaterThanEqual(name,
				categoryName, minPrice);
	}

	@Override
	public List<Product> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Product> findAll(SearchProductSpecification specification) {
		return repository.findAll(specification);
	}

	@Override
	public List<Product> findAll(Example<Product> example) {
		return repository.findAll(example);
	}

	@Override
	public List<Product> findAll(Specification<Product> priceGreaterThanEqualSpecification) {
		return repository.findAll(priceGreaterThanEqualSpecification);
	}

}
