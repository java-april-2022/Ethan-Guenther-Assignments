package com.codingdojo.bookclub.controllers;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.bookclub.models.Book_Club;
import com.codingdojo.bookclub.models.User;
import com.codingdojo.bookclub.services.BookService;
import com.codingdojo.bookclub.services.UserService;

@Controller
public class BookController {
	
	@Autowired
	private UserService userServ;
	@Autowired
	private BookService bookServ;
	
	
	@GetMapping("/addPage")
	public String addPage(@ModelAttribute("books") Book_Club book, Model model, HttpSession session)
	{
		User user = userServ.findById((Long)session.getAttribute("userId"));
		model.addAttribute("user", user);
		return "addPage.jsp";
	}
	
	@PostMapping("/addBook")
	public String addBook(@Valid @ModelAttribute("books") Book_Club book, Model model, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "addPage.jsp";
		}
		bookServ.save(book);
		
		return "redirect:/books";
	}
	
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable("id") Long id, Model model)
	{	
		Book_Club book = bookServ.findById(id);
		model.addAttribute("book", book);
		
		return "book.jsp";

	}
}
 
