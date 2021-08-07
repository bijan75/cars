package com.cars.digital.controller.errors;

public class DBCustomExcepction extends RuntimeException {

	public DBCustomExcepction(String message, Throwable cause) {
		super(message, cause);
	}

}
