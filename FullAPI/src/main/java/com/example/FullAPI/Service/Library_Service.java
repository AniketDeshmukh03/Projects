package com.example.FullAPI.Service;
import java.util.List;

import com.example.FullAPI.library.Books;

public interface Library_Service {
	Books insertBook(Books obj);
	List<Books>	getAllBooks();
	Books updateRecord(Books book);
	Books getBookById(int id);
	void deleteBookById(int id);

	

}
