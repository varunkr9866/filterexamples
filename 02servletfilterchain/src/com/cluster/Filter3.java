package com.cluster;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Filter3 implements Filter {
	
	public void init(FilterConfig fc) throws ServletException {
		System.out.println("Inside init() method of Filter3");
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc)
			throws IOException, ServletException {
		System.out.println("Begin doFilter() method of Filter3");
		String name = req.getParameter("nme");
		String ip = req.getRemoteAddr();
		System.out.println("Inside Filter3, Name is " + name);
		System.out.println("Inside Filter3, IP address is " + ip);
		fc.doFilter(req, res);
		System.out.println("Inside Filter3 after Servlet completed");
		System.out.println("End of doFilter() method in Filter3");
	}
	
	public void destroy() {
		System.out.println("Inside destroy() method of Filter3");
	}
}