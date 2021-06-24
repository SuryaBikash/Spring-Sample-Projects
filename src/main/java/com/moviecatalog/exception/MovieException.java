package com.moviecatalog.exception;

public class MovieException extends RuntimeException {



	private String errorMessage;

	public MovieException(String message) {
		super(message);
		// this.errorMessage=message;
	}

	public MovieException(String message, Throwable cause) {
		super(message, cause);
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
