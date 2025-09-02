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
public class Servlet2 extends HttpServlet {
	
	public void init(ServletConfig sc) throws ServletException {
		System.out.println("Inside init() method of Servlet2");
	}

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("In Servlet2");
		String name = req.getParameter("nme");
		String ip = req.getRemoteAddr();
		System.out.println("Inside Servlet2, Name is " + name);
		System.out.println("Inside Servlet2, IP address is " + ip);
		String msg = " Hello.." + name + "  your passed all the filter and all the servlet";
		PrintWriter pw = res.getWriter();
		pw.println("<html><body bgcolor='orange'>");
		pw.println("<h1>" + msg + "</h1");
		pw.println("</body></html>");
	}

	public void destroy() {
		System.out.println("Inside destroy() method of Servlet2");
	}
}
