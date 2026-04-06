package com.test;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		/*
		String name = request.getParameter("fname");
		
		String company  = request.getParameter("cmp");
		
		String lc = request.getParameter("loc");
		*/
		ServletContext ctx = getServletContext();
		
		String ct = ctx.getInitParameter("city");
		
		String st = ctx.getInitParameter("state");
		
		ServletContext ctx = getServletContext();
		
		String data = ct+" "+st;
		
		ctx.setAttribute("info" ,data);
		
		ServletConfig cfg = getServletConfig();
		
		String usr = cfg.getInitParameter("user");
		String psd = cfg.getInitParameter("pas");
		out.print(usr+" "+psd+" From servlet)
		
		
		
		
		out.println("<a href  = 'servlet'> next page </a>");
	}

}
