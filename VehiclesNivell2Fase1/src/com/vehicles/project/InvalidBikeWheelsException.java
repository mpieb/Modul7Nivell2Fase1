package com.vehicles.project;

public class InvalidBikeWheelsException extends Exception {
	
	private static final String INVALID_BIKE_WHEELS_EXCEPTION = 
                "El diàmetre de les rodes del davant i darrere no coincideix!";
	
	public InvalidBikeWheelsException() {
		super(INVALID_BIKE_WHEELS_EXCEPTION);
	}
}