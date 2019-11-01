package com.Exercise28MVCBasic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeNumberServlet
 */
@WebServlet("/PrimeNumberServlet")
public class PrimeNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int numero1=Integer.parseInt(request.getParameter("txtPrimeNumber"));
		
		boolean isPrime=true;
		
		for (int i=2; i<numero1;i++)
		{
			if(numero1%i==0)
			{
				isPrime=false;
			}
		}
		
		response.getWriter().append("Is the number is prime?: "+isPrime);
	}

}
