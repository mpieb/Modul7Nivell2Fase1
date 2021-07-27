package com.vehicles.project;

public class InvalidPlateException extends Exception {

	private static final String INVALID_PLATE_ERROR = 
                "La matrícula ha de tenir quatre nombres i dues o tres lletres!";
	
	public InvalidPlateException() {
		super(INVALID_PLATE_ERROR);
	}
}
