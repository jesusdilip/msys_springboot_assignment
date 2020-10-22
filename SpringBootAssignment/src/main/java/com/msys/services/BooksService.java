package com.msys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msys.model.DAOBook;
import com.msys.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	private BooksRepository booksRepository;
	
	public void addBook(DAOBook daoBook) {
		booksRepository.save(daoBook);
	}
	
	public List<DAOBook> getAllBooks(){
		return booksRepository.findAll();
	}
	
	public DAOBook getByTitle(String title) {
		return booksRepository.findByTitle(title);
	}
	
	public DAOBook getByIsbn(String isbn) {
		return booksRepository.findByIsbn(isbn);
	}
	
	public List<DAOBook> getByAuthor(String author){
		return booksRepository.findByAuthor(author);
	}

	public void updateBook(DAOBook book) {
		booksRepository.save(book);
	}


	public void deleteBook(String id) {
		booksRepository.deleteById(id);
		
	}
}
