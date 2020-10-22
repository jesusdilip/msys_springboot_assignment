package com.msys.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.msys.model.DAOBook;


public interface BooksRepository extends JpaRepository<DAOBook, String>{

	DAOBook findByTitle(String title);
	DAOBook findByIsbn(String isbn);
	List<DAOBook> findByAuthor(String author);
}
