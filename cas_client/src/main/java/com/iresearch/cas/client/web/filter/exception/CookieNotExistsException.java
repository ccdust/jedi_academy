package com.iresearch.cas.client.web.filter.exception;

public class CookieNotExistsException extends IllegalArgumentException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CookieNotExistsException(){
		
	}
	
	public CookieNotExistsException(String msg){
		super(msg);
	}
}
