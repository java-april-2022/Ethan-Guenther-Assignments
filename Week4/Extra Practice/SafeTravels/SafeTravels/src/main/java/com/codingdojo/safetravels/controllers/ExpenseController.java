package com.codingdojo.safetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.safetravels.models.Expense;
import com.codingdojo.safetravels.services.ExpenseService;

@Controller
public class ExpenseController 
{
	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("expense") Expense expense, Model model)
	{
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	@PostMapping("/")
	public String index(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) 
	{
		if(result.hasErrors())
		{
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}
		else 
		{
			expenseService.createExpense(expense);
			return "redirect:/";
		}
	}
	
	@GetMapping("/edit/{id}")
	public String editPage(@PathVariable("id") Long id, Model model)
	{
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	@PutMapping("/edit/{id}")
	public String update(@PathVariable("id")Long id, Model model,
			@Valid @ModelAttribute("expense") Expense expense, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "redirect:/edit/{id}";
		}
		else
		{
			expenseService.update(expense);
			return "redirect:/";
		}
	}
    @DeleteMapping("/expenses/{id}")
    public String destroy(@PathVariable("id") Long id) {
        expenseService.delete(id);
        return "redirect:/";
    }
    
    @GetMapping("/show/{id}")
    public String show(@PathVariable("id") Long id, Model model)
    {
    	Expense expense = expenseService.findExpense(id);
    	model.addAttribute("expense", expense);
    	return "show.jsp";
    }
}
