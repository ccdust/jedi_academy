package com.iresearch.cas.client.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.iresearch.cas.client.filter.AuthenticationFilter;
import com.iresearch.cas.client.filter.RedirectAuthenticationFilter;
import com.iresearch.cas.client.web.filter.exception.CookieNotExistsException;

public class CookieAuthenticationFilter extends RedirectAuthenticationFilter implements AuthenticationFilter{
	
	private String cookieName;
	
	private String remoteValidateCookieUrl;
	
	public void setCookieName(String cookieName) {
		this.cookieName = cookieName;
	}
	
	public void setRemoteValidateCookieUrl(String remoteValidateCookieUrl) {
		this.remoteValidateCookieUrl = remoteValidateCookieUrl;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		if(!isAuthenticated((HttpServletRequest)request)){
			((HttpServletResponse)response).sendRedirect(getRemoteServerUrl());
		}else{
			chain.doFilter(request, response);
		}
	}

	@Override
	public boolean isAuthenticated(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		if(StringUtils.isBlank(cookieName)){
			throw new CookieNotExistsException("请定义cookie名称");
		}
		
		Cookie[] cookies=request.getCookies();
		if(cookies==null || cookies.length<1){
			return false;
		}
		for(Cookie cookie:cookies){
			if(cookie.getName().equals(cookieName)){
				return validateCookie(cookie);
			}
		}
		
		return false;
	}
	
	private boolean validateCookie(Cookie cookie){
		
		return false;
	}
}
