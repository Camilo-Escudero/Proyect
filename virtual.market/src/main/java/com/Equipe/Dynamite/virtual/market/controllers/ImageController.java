package com.Equipe.Dynamite.virtual.market.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Equipe.Dynamite.virtual.market.dtos.ImageDto;
import  com.Equipe.Dynamite.virtual.market.entities.Image;
import  com.Equipe.Dynamite.virtual.market.repositories.ImageRepository;

@Controller
public class ImageController {
	
	@Autowired
	
	private ImageRepository imageRepository;
	
	public void createImage(ImageDto imageDto) {
		Image image = new Image (imageDto.getId(),imageDto.getProduct(),imageDto.getImage());
		this.imageRepository.save(image);
	}
	

}
