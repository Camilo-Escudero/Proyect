package com.Equipe.Dynamite.virtual.market.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Equipe.Dynamite.virtual.market.dtos.ProductDto;
import  com.Equipe.Dynamite.virtual.market.entities.Product;
import  com.Equipe.Dynamite.virtual.market.repositories.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void createProduct(ProductDto productDto) {
		Product product = new Product(productDto.getId(),productDto.getStock(),productDto.getDescription(),productDto.getName(),productDto.getPrice(),productDto.getCategorie());
		this.productRepository.save(product);		
	}
	

}
