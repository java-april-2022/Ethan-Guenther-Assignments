package com.codingdojo.bookclub.repositories;

import java.awt.print.Book;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.bookclub.models.Book_Club;


@Repository
public interface BookRepository extends CrudRepository<Book_Club, Long> {

	List<Book_Club> findAll();
}