package com.example.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Service.BookService;
import com.example.model.BookModel;

@Controller
@RequestMapping("book")
public class BookController {

	private static final Logger LOGGER = Logger.getLogger(BookController.class);

	@Autowired
	private BookService bookService;

	@GetMapping
	public String list(ModelMap map) {
		LOGGER.info("Entering list");
		
		List<BookModel> book = null ; 
		book = bookService.findAll();
	//	session.setAttribute("book", book);
		map.addAttribute("book", book);
		return "book/list";
	}
	
	@GetMapping("/{isbn}")
	public String show(@PathVariable("isbn") long isbn, ModelMap modelMap, HttpSession session) 
	{
		System.out.println("ShowBook:" + isbn);
		BookModel book = bookService.findOne(isbn);
		modelMap.addAttribute("SELECTED_BOOK", book);
		return "book/show";
	}
}
