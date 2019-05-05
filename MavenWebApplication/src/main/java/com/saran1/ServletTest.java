package com.saran1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class ServletTest extends GenericServlet {
	
	public void init() {
		System.out.println("calling init");
	
		
	}

	public void service(ServletRequest req, ServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("Welcome to the world of Servlets");
		pw.close();
		
	}
	public void destroy() {
		System.out.println("calling destroy");
		
	}
}
