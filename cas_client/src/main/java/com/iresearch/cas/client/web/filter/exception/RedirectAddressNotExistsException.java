package com.iresearch.cas.client.web.filter.exception;

public class RedirectAddressNotExistsException extends IllegalArgumentException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RedirectAddressNotExistsException(){
		
	}
	
	public RedirectAddressNotExistsException(String msg){
		super(msg);
	}
}
