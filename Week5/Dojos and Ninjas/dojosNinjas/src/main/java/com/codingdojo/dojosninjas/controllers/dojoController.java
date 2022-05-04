package com.codingdojo.dojosninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosninjas.models.Dojo;
import com.codingdojo.dojosninjas.services.DojoService;
import com.codingdojo.dojosninjas.services.NinjaService;

@Controller
public class dojoController 
{
	@Autowired
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/")
	public String redirect()
	{
		return "redirect:/dojo/new";
	}
	@GetMapping("/dojo/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo)
	{
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojo/create")
	public String createDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result, Model model)
	{
		if(result.hasErrors())
		{
			return "newdojo.jsp";
		}
		this.dojoService.create(dojo);
		return "redirect:/ninjas/new"; 
	}
	
	@GetMapping("/dojos/{id}")
	public String show(Model model,@PathVariable("id") Long id)
	{
		model.addAttribute("dojo",this.dojoService.findID(id));
		return "show.jsp";
	}
}
