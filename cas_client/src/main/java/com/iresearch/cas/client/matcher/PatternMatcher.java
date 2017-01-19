package com.iresearch.cas.client.matcher;

//路径匹配接口
public interface PatternMatcher {
	
	//是否匹配
	public boolean match(String src,String pattern);
	
}
