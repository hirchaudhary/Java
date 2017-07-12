package com.randomword.controllers;
import java.util.Date;
import java.util.Random;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RandomWord extends HttpServlet {
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
		
		String string = new String("1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
        String word;
        word = new String();
        Random r = new Random();
        Date date = new Date();
        session.setAttribute("date", date.toString());
        for (int i=1; i<=10; i++) {
            word = word + string.charAt(r.nextInt(string.length()));
        }
        session.setAttribute("word", word);
		response.sendRedirect("/RandomWord/Ind");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
