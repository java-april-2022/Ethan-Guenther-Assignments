package com.codingdojo.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.bookclub.models.LoginUser;
import com.codingdojo.bookclub.models.User;
import com.codingdojo.bookclub.repositories.UserRepository;
@Service
public class UserService
{
	    
	    @Autowired
	    private UserRepository userRepo;
	    
	    public User register(User newUser, BindingResult result)
	    {
	    	Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
	    	
	    	// Reject if email is taken (present in database)
	    	if(potentialUser.isPresent())
	    	{
	    		result.rejectValue("email", "Matches", "That email has already been taken");
	    	}
	    	
	        // Reject if password doesn't match confirmation
	    	if(!newUser.getPassword().equals(newUser.getConfirm())) 
	    	{
	    		result.rejectValue("confirm", "Matches", "Passwords Must Match");
	    	}
	    	
	    	// Return null if result has errors
	    	if(result.hasErrors())
	    	{
	    		return null;
	    	}
	    
	        // Hash and set password, save user to database
	    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
	    	newUser.setPassword(hashed);
	    	return userRepo.save(newUser);
	    	
	    }
	    public User login(LoginUser newLoginObject, BindingResult result)
	    {
	    	Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmail());
	        
	    	// Find user in the DB by email
	        // Reject if NOT present
	    	if(!potentialUser.isPresent()) 
	    	{
	    		result.rejectValue("email", "Matches", "User with that email address not found!");
	    		return null;
	    	}
	    	
	    	// User exists, retrieve user from DB
	    	User user = potentialUser.get();
	        
	        // Reject if BCrypt password match fails
	    	if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) 
	    	{
	    	    result.rejectValue("password", "Matches", "Invalid Password!");
	    	}
	    	
	    	// Return null if result has errors
	    	if(result.hasErrors()) {
	    		return null;
	    	}
	    	
	        // Otherwise, return the user object
	        return user;
	    }
	    
	    public User findById(Long id) {
	    	Optional<User> potentialUser = userRepo.findById(id);
	    	if(potentialUser.isPresent()) {
	    		return potentialUser.get();
	    	}
	    	return null;
	    }

}

