package com.msys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.msys.model.DAOBook;
import com.msys.services.BooksService;


@RestController
public class ResourceController {
	
	@Autowired
	private BooksService booksService;
	
	
	// Create Book - Accessed By : Admin
	@RequestMapping(method = RequestMethod.POST, value = "/addbook")
	public void addBook(@RequestBody DAOBook daobook) {
		booksService.addBook(daobook);
	}
	
	// Get book by ISBN - Accessed By : Admin, User
	@RequestMapping("/getbyisbn/{isbn}")
	public DAOBook getByIsbn(@PathVariable String isbn) {
		return booksService.getByIsbn(isbn);
		
	}
	
	// Get All Books - Accessed By : Admin, User
	@RequestMapping("/allbooks")
	public List<DAOBook> getAllBooks(){
		return booksService.getAllBooks();
	}
	
	// Get by title - Accessed By : Admin, User
	@RequestMapping("/getbytitle/{title}")
	public DAOBook getByTitle(@PathVariable String title) {
		return booksService.getByTitle(title);
		
	}
	
	// Update a Book - Accessed By : Admin
	@RequestMapping(method = RequestMethod.PUT, value = "/update")
	public void updateBook(@RequestBody DAOBook book) {
		booksService.updateBook(book);
	}
	
	// Get by author  Accessed By :- Admin, User
	@RequestMapping("/getbyauthor/{author}")
	public List<DAOBook> getByAuthor(@PathVariable String author) {
		return booksService.getByAuthor(author);
		
	}
	
	
	// Delete - Accessed By : Admin
	@RequestMapping(method = RequestMethod.DELETE,value="/delete/{id}")
	public void deleteBook(@PathVariable String id) {
		booksService.deleteBook(id); 
	}

}
