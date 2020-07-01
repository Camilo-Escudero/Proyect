package com.Equipe.Dynamite.virtual.market.resources.exceptions;

public class ImageCreateError extends Exception{
	
	private static final long serialVersionUID = -7717691994704695707L;
	
	public static final String DESCRIPTION="Bad information send";
	
	public ImageCreateError() {
		super(DESCRIPTION);
	}
	
	public ImageCreateError(String message) {
		super(DESCRIPTION+""+message);
	}
	

}