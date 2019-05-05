package com.saran1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String username = req.getParameter("uname");
		String password = req.getParameter("pwd");
		req.setAttribute("ABC", username);
		req.setAttribute("DEF", password);
		if (username.equals("Umair")&&password.equals("123")) {
			RequestDispatcher rd= req.getRequestDispatcher("result.jsp");
			rd.forward(req, res);		
			
		}
		else {
			pw.println("<h1 style='color:red'>Invalid Username /Password</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("test.html");
			rd.include(req, res);
		}	
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	doGet(req,res);	
}
}
