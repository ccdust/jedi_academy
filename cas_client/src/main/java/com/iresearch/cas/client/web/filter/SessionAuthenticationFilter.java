package com.iresearch.cas.client.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.util.StringUtils;

import com.iresearch.cas.client.filter.AbstractInitParamFilter;
import com.iresearch.cas.client.filter.AuthenticationFilter;
import com.iresearch.cas.client.web.filter.exception.RedirectAddressNotExistsException;
import com.iresearch.cas.client.web.filter.exception.SessionAttributeNotExistsException;

public class SessionAuthenticationFilter extends AbstractInitParamFilter implements AuthenticationFilter{
	
	private String sessionAttributeName;
	
	private String remoteServerAddress;
	
	public void setSessionAttributeName(String sessionAttributeName) {
		this.sessionAttributeName = sessionAttributeName;
	}

	public void setRemoteServerAddress(String remoteServerAddress) {
		this.remoteServerAddress = remoteServerAddress;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		if(isAuthenticated((HttpServletRequest)request)){
			if(StringUtils.isEmpty(remoteServerAddress)){
				throw new RedirectAddressNotExistsException("服务端地址不能为空!");
			}
		    ((HttpServletResponse)response).sendRedirect(remoteServerAddress);
			return;
		}
	}

	@Override
	public boolean isAuthenticated(HttpServletRequest request) {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		if(StringUtils.isEmpty(sessionAttributeName)){
			throw new SessionAttributeNotExistsException("session属性不存在!");
		}
		return session.getAttribute(sessionAttributeName)==null;
	}

}
