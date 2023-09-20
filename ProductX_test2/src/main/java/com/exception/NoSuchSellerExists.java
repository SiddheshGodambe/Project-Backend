package com.exception;

public class NoSuchSellerExists extends RuntimeException{
	private String msg;

	public NoSuchSellerExists(String msg) {
		super(msg);
		this.msg = msg;
	}

}
