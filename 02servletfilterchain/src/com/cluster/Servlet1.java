package com.cluster;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Servlet1 extends HttpServlet {

	public void init(ServletConfig sc) throws ServletException {
		System.out.println("Inside init() method of Servlet1");
	}

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("In Servlet1");
		String name = req.getParameter("nme");
		String ip = req.getRemoteAddr();
		System.out.println("Inside Servlet1, Name is " + name);
		System.out.println("Inside Servlet1, IP address is " + ip);
		RequestDispatcher rd = req.getRequestDispatcher("./second");
		rd.forward(req, res);
	}

	public void destroy() {
		System.out.println("Inside destroy() method of Servlet1");
	}

}
