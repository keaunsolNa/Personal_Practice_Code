package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ContainerServiceTest {

	@Test
	public void getObject_BookRepository() {
		BookRepository bookRepository = ContainerService.getObject(BookRepository.class);
		assertNotNull(bookRepository);
	}
	
	@Test
	public void getObject_BookService() {
		BookService bookService = ContainerService.getObject(BookService.class);
		assertNotNull(bookService);
		assertNotNull(bookService.bookRepository);
	}
	
	
}
