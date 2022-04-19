package com.codingdojo.daikichiroute;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	// ...
	
	    @RequestMapping("")
	    public String daikichi(){
	      return "Welcome";
	    }
	    @RequestMapping("/today")
	    public String today(){
	      return "Today you will find good luck in all your endeavors!";
	    }
	    @RequestMapping("/tomorrow")
	    public String tomorrow(){
	      return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	    }
	    @RequestMapping("/travel/{city}")
	    public String travel(@PathVariable String city)
	    {
	    	return "Congratulations!!!! You will soon travel to the great city of " + city;
	    }
	    @RequestMapping("/lotto/{num}")
	    public String lotto(@PathVariable int num)
	    {
	    	if(num%2 == 0)
	    	{
	    		return "You will take a grand journey in the near future, but be wary of tempting offers";
	    	}
	    	else
	    	{
	    		return "You have enjoyed the fruits of your labor, but now is a great time to spend with family and friends";
	    	}
	    }
	}

