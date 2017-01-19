package com.iresearch.cas.client.web.filter.exception;

public class SessionAttributeNotExistsException extends IllegalArgumentException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SessionAttributeNotExistsException(){
		
	}
	
    public SessionAttributeNotExistsException(String msg){
		super(msg);
	}
	
}
