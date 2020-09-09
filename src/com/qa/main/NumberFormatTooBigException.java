package com.qa.main;

public class NumberFormatTooBigException extends RuntimeException {

	public NumberFormatTooBigException() {

	}

	public NumberFormatTooBigException(String msg) {
		super(msg);
	}

}
