package com.niit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginEx
 */

public class LoginEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginEx() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
		PrintWriter pw=response.getWriter();
//		String name=request.getParameter("name");
//		String password=request.getParameter("pass");
		
		  RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
//	        rd.forward(request, response);  
		rd.include(request, response);
		
		pw.println("this is loginEx");
		  
		
	}
		
		catch(Exception e)
		{
			System.out.println("EXCEPTION"+e);
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
