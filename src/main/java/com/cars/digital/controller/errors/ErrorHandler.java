package com.cars.digital.controller.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

	@ExceptionHandler(value = DBCustomExcepction.class)
	public ResponseEntity<ErrorResponse> handleDatabaseException(Throwable e) {

		return new ResponseEntity<>(new ErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = ArgumentsNotValidException.class)
	public ResponseEntity<ErrorResponse> handleArgumentsNotValidException(Throwable e) {

		return new ResponseEntity<ErrorResponse>(new ErrorResponse(e.getMessage()), HttpStatus.BAD_REQUEST);
	}
}
