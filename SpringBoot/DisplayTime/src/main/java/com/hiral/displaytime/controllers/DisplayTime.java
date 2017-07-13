package com.hiral.displaytime.controllers;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DisplayTime {
	@RequestMapping("")
	public String index(){
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model){
		SimpleDateFormat sdfDate = new SimpleDateFormat("EEEE ', the' dd 'of' MMMM ',' yyyy");
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    model.addAttribute("date", strDate);
		return "dateDisplay.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model){
		SimpleDateFormat sdfDate = new SimpleDateFormat("hh:mm a");
	    Date now = new Date();
	    String strTime = sdfDate.format(now);
	    model.addAttribute("time", strTime);
		return "timeDisplay.jsp";
	}
}
