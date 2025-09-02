package com.cluster;

import java.io.IOException;
import java.io.PrintWriter;

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
public class MyServlet extends HttpServlet {
	public void init(ServletConfig sc) throws ServletException {
		System.out.println("Inside init() method of MyServlet");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("Begin doGet() method of Servlet");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("nme");
		String ip = req.getRemoteAddr(); // getting client IP address
		System.out.println("Inside Servlet,Name is " + name);
		System.out.println("Inside Servlet, IP address is " + ip);
		pw.println("<html><body bgcolor='wheat'>");
		pw.println("your name is: " + name);
		pw.println("</body></html>");
		System.out.println("End of doGet() method in Servlet");
	}

	public void destroy() {
		System.out.println("Inside destroy() method of MyServlet");
	}
}
