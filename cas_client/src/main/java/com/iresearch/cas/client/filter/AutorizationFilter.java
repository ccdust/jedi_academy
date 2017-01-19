package com.iresearch.cas.client.filter;

import javax.servlet.Filter;
import javax.servlet.ServletRequest;

public interface AutorizationFilter extends Filter{
	
	public boolean isAuthorized(ServletRequest request);
	
}
