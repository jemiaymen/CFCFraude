package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class home
 */
@WebServlet("/home")
public class home extends MyServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see MyServlet#MyServlet()
     */
    public home() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(IsLogin(request)){
			super.doGet(request, response);
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<h2>Welcome : <b>"+ _role + "</b></h2>");
			out.println("</body></html>");
		}else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<h2>You Must Login!! </h2>");
			out.println("</body></html>");
		}
		
		

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
