package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CoffeeModel;

//import com.saran.model.CoffeeModel;



public class CoffeeControler extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String c = req.getParameter("type");	//get selected attribute from coffee action, from UI
		
		//CoffeeModel cm= new CoffeeModel();
		CoffeeModel cm = new CoffeeModel();		//create a model
		List<String> result = cm.getTypes(c);	//get the results from the model
		req.setAttribute("coffee", result);		//put the result on the request
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp"); //Create an RequestDistpatcher in order to forward to the result.jsp page
		rd.forward(req, res);
			
	}
}
