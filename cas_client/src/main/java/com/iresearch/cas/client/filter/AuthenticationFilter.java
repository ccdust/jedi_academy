package com.iresearch.cas.client.filter;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;

public interface AuthenticationFilter extends Filter{

	public boolean isAuthenticated(HttpServletRequest request);

}
