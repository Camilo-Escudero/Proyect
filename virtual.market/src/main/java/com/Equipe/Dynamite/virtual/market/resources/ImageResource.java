package com.Equipe.Dynamite.virtual.market.resources;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Equipe.Dynamite.virtual.market.controllers.ImageController;
import com.Equipe.Dynamite.virtual.market.dtos.ImageDto;
import com.Equipe.Dynamite.virtual.market.resources.exceptions.ImageCreateError;

@RestController
@RequestMapping(ImageResource.IMAGE)
public class ImageResource {
	
	public static final String IMAGE = "/IMAGES";
	
	@Autowired
	private ImageController imageController;
	
	@PostMapping
	public void createImage(@Valid @RequestBody ImageDto imageDto )throws ImageCreateError{
		this.imageController.createImage(imageDto);
		
	}

}