package com.iresearch.cas.client.filter;

public abstract class RedirectAuthenticationFilter extends AbstractInitParamFilter implements AuthenticationFilter {
	
	private String remoteServerUrl;
		
	public void setRemoteServerUrl(String remoteServerUrl) {
		this.remoteServerUrl = remoteServerUrl;
	}

	public String getRemoteServerUrl() {
		return remoteServerUrl;
	}

}
