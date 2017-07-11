package com.me.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Me
 */
public class Me extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Me() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstName = request.getParameter("first");
		String lastName = request.getParameter("last");
		String favoriteLanguage = request.getParameter("favLang");
		String homeTown = request.getParameter("hometown");
		if(firstName == null){
			firstName = "unknown";
		}
		if(lastName == null){
			lastName = "unknown";
		}
		if(favoriteLanguage == null){
			favoriteLanguage = "unknown";
		}
		if(homeTown == null){
			homeTown = "unknown";
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
        out.write("<h1>First Name: "+ firstName + "</h1>");
        out.write("<h1>Last Name: "+ lastName + "</h1>");
        out.write("<h1>Favorite Language: "+ favoriteLanguage + "</h1>");
        out.write("<h1>Home Town: "+ homeTown + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
