package com.hiral.counter.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();		
		String str = (String) session.getAttribute("count");
	
		if(str != null){
			Integer count = Integer.parseInt(str);
			count += 1;
			session.setAttribute("count",count.toString());
		}else{
			session.setAttribute("count","0");
		}
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Counter.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
