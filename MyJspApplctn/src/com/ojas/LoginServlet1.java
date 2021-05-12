package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		
		request.setAttribute("username", uname);
		request.setAttribute("password", upass);
		
		RequestDispatcher rd = request.getRequestDispatcher("/LoginServlet2");
		pw.println("<h3 style=color:blue>From first Servlet</h3>");
		
//		rd.include(request, response);
		rd.forward(request, response);
		pw.println("<h4 style=color:green>Date : " + new java.util.Date() +
				"</h4>");
		
	}

}
