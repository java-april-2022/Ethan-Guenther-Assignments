package com.codingdojo.okimuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controllers 
{
	@RequestMapping("/")
	public String dfault()
	{
		return "redirect:/omikuji";
	}
	
	@RequestMapping("/omikuji")
	public String omikujiForm()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/omikuji/show")
	public String sentOmikuji(HttpSession session, Model model)
	{
		String omikuji = (String) session.getAttribute("result");
		model.addAttribute("omikuji", omikuji);
		
		return "myOmikuji.jsp";
	}
	
	@RequestMapping("/process")
	public String process(
	@RequestParam("number") int number,
	@RequestParam("city") String city,
	@RequestParam("person") String person,
	@RequestParam("hobby") String hobby,
	@RequestParam("living") String living,
	@RequestParam("text") String text,
	HttpSession session)
	{
		String result = "In " + number + "years, you will live in " + city + " with "
	+ person + " as your roommate," + hobby + " for a living. The next time you see a " +
	living + " you will have good luck. Also " + text;
		
		session.setAttribute("result", result);
		
		return "redirect:/omikuji/show";
			 
	}
}
