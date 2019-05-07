package com.marius;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

//import com.sun.tools.javac.util.Context;

public class DatasourceTest extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		Connection con = null;
		Statement st=null;
		ResultSet rs = null;
		try {
			//ctx = new InitialContext();
			InitialContext initialContext = new InitialContext();
			Object resource = initialContext.lookup("java:comp/env/jdbc/Driver");//??????
			DataSource ds = (DataSource) resource;
			con=ds.getConnection();
			st = con.createStatement();
		//	ObjecctResource
			rs= st.executeQuery("select * from emp");
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			pw.println("<html><body>" + "<h2 style='color:blue'>Empoyee Details</h2"
					+ "<h2 style='color:blue'>Employee Details</h2>");
			pw.print("<table border =\"1\"cellspacing=10 cellpadding=5>");
			pw.print("<th> Employee Number</th>");
			pw.print("<th> Employee Name</th>");
			pw.print("<th> Employee Salary</th>");
			while(rs.next()) {
				pw.print("<tr>");
				pw.print("<td>"+rs.getInt(1)+"</td>");
				pw.print("<td>"+rs.getString(2)+"</td>");
				pw.print("<td>"+rs.getInt(3)+"</td>");
				pw.print("</tr>");
			}
			pw.print("</table></body></br>");
			rs.close();st.close();con.close();
			
		}catch(Exception e) {
		e.printStackTrace();
		}
	}
}
