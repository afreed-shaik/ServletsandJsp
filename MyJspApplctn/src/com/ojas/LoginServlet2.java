package com.ojas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet2() {
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
		
		String uname = (String) request.getAttribute("username");
		String upass = (String) request.getAttribute("password");
		
		if(uname.equalsIgnoreCase("ojas") && 
				upass.equalsIgnoreCase("java")) {
			pw.println("<h1>Valid User</h1>");
		}
		else {
			pw.println("<h1>Invalid User</h1>");
		}
	}

}
