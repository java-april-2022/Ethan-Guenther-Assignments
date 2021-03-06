package com.codingdojo.counter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Counter
{
	@RequestMapping("/")
	public String counter(HttpSession session, Model model)
	{
		if(session.getAttribute("count") == null)
		{
			session.setAttribute("count", 0);
		}
		else
		{
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
		}
		
		return "index.jsp";
	}
	
	@RequestMapping("/counter/")
	public String counter(HttpSession session, Model model, HttpServletRequest request)
	{
		Integer currentCount = 0;
		if(session.getAttribute("count") == null)
		{
			session.setAttribute("count", 0);
		}
		else
		{
			currentCount = (Integer) session.getAttribute("count");
		}
			String homeUrl = request.getRequestURL().toString();
			model.addAttribute("currentCount",currentCount);
			//takes the entire url page of url/counter to match original url... used to return to original page
			model.addAttribute("urlPage", homeUrl.substring(0,homeUrl.length()-9));
			return "counter.jsp";
	}
	
	@RequestMapping("/double-counter/")
	public String doubleCounter(HttpSession session, Model model) 
	{
		
		if (session.getAttribute("count") == null) 
		{
			session.setAttribute("count", 0);
		}else 
		{
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount+=2;
			session.setAttribute("count", currentCount);
		}

	    return "counter2.jsp";
	}
	
	@RequestMapping("/reset-counter/")
	public String resetCounter(HttpSession session, Model model, HttpServletRequest request)
	{
		
		session.setAttribute("count", 0);

		return "redirect:/counter/";
	}
 
}