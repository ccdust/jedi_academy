package com.iresearch.cas.client.filter;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;

public abstract class AbstractInitParamFilter implements Filter{
	
	protected Map<String,Object> initParams=Collections.synchronizedMap(new HashMap<String,Object>());
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Enumeration<String> e=filterConfig.getInitParameterNames();
		while(e.hasMoreElements()){
			String initParameterName=e.nextElement();
			initParams.put(initParameterName, filterConfig.getInitParameter(initParameterName));
		}
	}
	
	@Override
	public void destroy(){
		if(initParams!=null){
			initParams.clear();
		}
	}
}
