package com.vehicles.project;

public class InvalidWheelDiameterException extends Exception {

	private static final String INVALID_WHEEL_DIAMETER_ERROR = 
                "El diàmetre de la roda ha de estar entre 0,4 i 4 polzades!";
	
	public InvalidWheelDiameterException() {
		super(INVALID_WHEEL_DIAMETER_ERROR);
	}
}
