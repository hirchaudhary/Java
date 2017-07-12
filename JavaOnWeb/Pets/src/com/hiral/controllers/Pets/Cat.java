package com.hiral.controllers.Pets;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hiral.models.Animals.Cats;

public class Cat extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
        String breed = request.getParameter("breed");
        double weight = Double.parseDouble(request.getParameter("weight"));
        Cats cat = new Cats(name, breed, weight);
        request.setAttribute("cat", cat);
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/cats.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
