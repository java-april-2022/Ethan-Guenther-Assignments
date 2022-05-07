package com.codingdojo.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.bookclub.models.Book_Club;
import com.codingdojo.bookclub.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository repo;
	
	public Book_Club findById(Long id)
	{
		Optional<Book_Club> result =repo.findById(id);
		if(result.isPresent())
		{
			return result.get();
		}
		return null;
	}
	
	//Returns a list of all the books
	public List<Book_Club> getAll()
	{
		return repo.findAll();
	}
	
	//Updates and saves the book values
	public Book_Club update(Book_Club book)
	{
		return repo.save(book);
	}
	
	//Saves the book Object
	public Book_Club save(Book_Club book)
	{
		return repo.save(book);
	}
	
	//Deletes the book object
	public void delete(Book_Club book)
	{
		repo.delete(book);
	}
}
