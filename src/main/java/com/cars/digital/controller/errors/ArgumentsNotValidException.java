package com.cars.digital.controller.errors;

public class ArgumentsNotValidException extends RuntimeException {

	public ArgumentsNotValidException(String message, Throwable thr) {

		super(message, thr);

	}

	public ArgumentsNotValidException(String message) {
		super(message);
	}
}
