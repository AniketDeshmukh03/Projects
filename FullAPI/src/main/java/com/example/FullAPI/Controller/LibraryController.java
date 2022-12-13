package com.example.FullAPI.Controller;
import com.example.FullAPI.Service.Library_Service;
import com.example.FullAPI.library.Books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller

public class LibraryController {

	Library_Service libService;

	public LibraryController(Library_Service libService) {

		this.libService = libService;
	}

	@GetMapping("/login")
	public String LoginPg(Model model) {


		return "Login";
	}

	@GetMapping("/viewAllBooks")
	public String viewAllBooks(Model model) {

		model.addAttribute("BookList",libService.getAllBooks());
		return "Libraries"; 
	}

	@GetMapping("/goToHomPage")
	public String goTohomePage(Model model) {

		return "HomePage";
	}

	@GetMapping("/menuBar")
	public String MenuPg(Model modelobj) {


		return "Menu";
	}

	@GetMapping("/addNewBooks")
	public String addBooks(Model model) {
		Books book=new Books();
		model.addAttribute("bookDetails",  book);
		return "CreateBook";	
	}

	@PostMapping("/insertNewBooks")
	public String insertBook(@ModelAttribute("bookDetails") Books newBook ){
		libService.insertBook(newBook);
		return "redirect:/viewAllBooks";
	}

	@GetMapping("/bookDataEdit/{Sr_No}")
	public String editBookData(@PathVariable("Sr_No") int id,Model model) {
		model.addAttribute("bookFromDb",libService.getBookById(id));
		return "viewUpdateBookData";
	}

	@PostMapping("/updateBookData/{Sr_No}")  //In form only GET and POST mapping can be used
	public String updateBookData(@PathVariable("Sr_No") int id,@ModelAttribute("bookFromDb") Books existingBookData,Model model) {
		Books newBook = libService.getBookById(id);
		newBook.setSr_No(id);
		newBook.setName(existingBookData.getName());
		newBook.setAuthorName(existingBookData.getAuthorName());
		newBook.setAvailable(existingBookData.getAvailable());
		newBook.setDepartmet(existingBookData.getDepartmet());

		libService.updateRecord(newBook);

		return "redirect:/viewAllBooks";
	}

	@GetMapping("/deleteBookData/{Sr_No}")
	public String deleteEmp(@PathVariable int Sr_No) {
		libService.deleteBookById(Sr_No);
		return "redirect:/viewAllBooks";
	}



	@GetMapping("/logOutStd")
	public String LogOutPg(Model model) {


		return "LogOutPg";
	}




//		@GetMapping("/validate")
//		public String validated(@ModelAttribute("adminObject") Admin adminObj) {
//			if (adminObj.getClientId().ge.equals("") &&
//					adminObj.getpassword().equals("Ani1234")) {
//				
//				return "redirect:/goToHomPage";
//			}
//			return "redirect:/login";
//		}
	
	



}


