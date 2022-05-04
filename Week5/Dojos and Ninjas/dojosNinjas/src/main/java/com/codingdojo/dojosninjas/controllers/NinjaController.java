package com.codingdojo.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosninjas.models.Dojo;
import com.codingdojo.dojosninjas.models.Ninja;
import com.codingdojo.dojosninjas.services.DojoService;
import com.codingdojo.dojosninjas.services.NinjaService;

@Controller
public class NinjaController 
{
	@Autowired
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja")Ninja ninja, Model model)
	{
		List<Dojo> allDojos = this.dojoService.getAll();
		model.addAttribute("getall", allDojos);
		return "newNinja.jsp";
	}
	@PostMapping("ninja/create")
	public String createNinja(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result, Model model)
	{
		if(result.hasErrors())
		{
			model.addAttribute("getall", dojoService.getAll());
			return "newNinja.jsp";
		}
		this.ninjaService.create(ninja);
		return "redirect:/dojos/" + ninja.getDojo().getId();
		
	}
}