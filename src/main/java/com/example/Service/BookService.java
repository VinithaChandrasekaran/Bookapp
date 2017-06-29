package com.example.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.BookRepository;
import com.example.model.BookModel;

@Service
public class BookService {
		@Autowired
		private BookRepository bookRepository;

		public List<BookModel> findAll() {
			return bookRepository.findAll();
		}

		public BookModel findOne(long isbn) {
			return bookRepository.findOne(isbn);
		}
	}



