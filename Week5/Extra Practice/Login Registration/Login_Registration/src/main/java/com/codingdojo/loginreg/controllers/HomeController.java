package com.codingdojo.loginreg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.loginreg.models.LoginUser;
import com.codingdojo.loginreg.models.User;
import com.codingdojo.loginreg.services.UserService;

@Controller
public class HomeController 
{
    
//     Add once service is implemented:
     @Autowired
     private UserService userServ;
    
    @GetMapping("/")
    public String index(Model model)
    {
    
        // Bind empty User and LoginUser objects to the JSP
        // to capture the form input
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) 
    {
        
        // TO-DO Later -- call a register method in the service 
    	User user = userServ.register(newUser, result);
        // to do some extra validations and create a new user!
        
        if(result.hasErrors())
        {
            // Be sure to send in the empty LoginUser before 
            // re-rendering the page.
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        
        session.setAttribute("userId", user.getId());
        
        // No errors! 
        // TO-DO Later: Store their ID from the DB in session, 
        // in other words, log them in.
    
        return "redirect:/home";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        
        // Add once service is implemented:
    	
         User user = userServ.login(newLogin, result);
    
        if(result.hasErrors() || user==null) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
    
        // No errors! 
        session.setAttribute("userId", user.getId());
        
        // TO-DO Later: Store their ID from the DB in session, 
        // in other words, log them in.
    
        return "redirect:/home";
    }
    
    @GetMapping("/home")
    public String loggedIn(HttpSession session, Model model)
    {
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		
		// We get the userId from our session (we need to cast the result to a Long as the 'session.getAttribute("userId")' returns an object
		Long userId = (Long) session.getAttribute("userId");
		model.addAttribute("user", userServ.findById(userId));
    	return "success.jsp";
    }
    
}
