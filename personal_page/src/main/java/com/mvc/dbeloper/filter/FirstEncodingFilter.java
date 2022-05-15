package com.mvc.dbeloper.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class FirstEncodingFilter implements Filter {
	
	private String encodingType;
	
    public FirstEncodingFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest hrequest = (HttpServletRequest) request;
		RequestWrapper wrapper = new RequestWrapper(hrequest);
		if("POST".equals(hrequest.getMethod())) {
			request.setCharacterEncoding(encodingType);
		}

		chain.doFilter(wrapper, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

		encodingType = fConfig.getInitParameter("encoding-type");
	}

}
